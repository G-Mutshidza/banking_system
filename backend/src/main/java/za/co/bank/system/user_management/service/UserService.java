package za.co.bank.system.user_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.bank.system.user_management.dto.SignUpDTO;
import za.co.bank.system.user_management.dto.UserDetailsDTO;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.entity.UserProfile;
import za.co.bank.system.user_management.repository.UserDetailsRepository;
import za.co.bank.system.user_management.repository.UserRepository;


@Service
public class UserService{

    private final UserRepository userRepository;
    private final UserDetailsRepository userDetailsRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(@Qualifier("mongoUserRepository") UserRepository userRepository, @Qualifier("mongoUserRepository") UserDetailsRepository userDetailsRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(SignUpDTO signUpDTO) {
        if (userRepository.existsByUsername(signUpDTO.getUsername())) {
            throw new IllegalArgumentException("Username already taken.");
        }
        if (userRepository.existsByEmail(signUpDTO.getEmail())) {
            throw new IllegalArgumentException("Email already registered.");
        }

        User user = new User();
        user.setUsername(signUpDTO.getUsername());
        user.setEmail(signUpDTO.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDTO.getPassword()));

        return userRepository.save(user);
    }

    public UserProfile addUserDetails(UserDetailsDTO userDetailsDTO, User user) {
        UserProfile userProfile = new UserProfile();

        userProfile.setFirstName(userDetailsDTO.getFirstName());
        userProfile.setLastName(userDetailsDTO.getLastName());
        userProfile.setDateOfBirth(userDetailsDTO.getDateOfBirth());
        userProfile.setIdNumber(userDetailsDTO.getIdNumber());
        userProfile.setAddress(userDetailsDTO.getAddress());
        userProfile.setPhoneNumber(userDetailsDTO.getPhoneNumber());
        userProfile.setUserId(user.getId());

        return userDetailsRepository.save(userProfile);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

}
