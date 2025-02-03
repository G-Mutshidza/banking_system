package za.co.bank.system.user_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.bank.system.user_management.dto.SignUpDTO;
import za.co.bank.system.user_management.dto.UserDetailsDTO;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.entity.UserDetails;
import za.co.bank.system.user_management.repository.UserDetailsRepository;
import za.co.bank.system.user_management.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService{

    private final UserRepository userRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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

    public UserDetails addUserDetails(UserDetailsDTO userDetailsDTO, Optional<User> user) {
        UserDetails userDetails = new UserDetails();

        userDetails.setFirstName(userDetailsDTO.getFirstName());
        userDetails.setLastName(userDetailsDTO.getLastName());
        userDetails.setDateOfBirth(userDetailsDTO.getDateOfBirth());
        userDetails.setAddress(userDetailsDTO.getAddress());
        userDetails.setPhoneNumber(userDetailsDTO.getPhoneNumber());
        userDetails.setUser(user);

        return userDetailsRepository.save(userDetails);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


}
