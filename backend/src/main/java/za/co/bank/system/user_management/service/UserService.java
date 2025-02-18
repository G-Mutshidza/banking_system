package za.co.bank.system.user_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.bank.system.user_management.dto.SignUpDTO;
import za.co.bank.system.user_management.dto.UserDetailsDTO;
import za.co.bank.system.user_management.entity.Role;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.entity.UserProfile;
import za.co.bank.system.user_management.repository.RoleRepository;
import za.co.bank.system.user_management.repository.UserProfileRepository;
import za.co.bank.system.user_management.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserService{

    private final UserRepository userRepository;
    private final UserProfileRepository userProfileRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, UserProfileRepository userProfileRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(SignUpDTO signUpDTO, Set<String> roleNames) {
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

        Set<Role> roles = new HashSet<>();
        for(String roleName : roleNames) {
            Role role = roleRepository.findByName(roleName)
                    .orElseThrow(() -> new IllegalArgumentException("Role " + roleName + " not found!"));
            roles.add(role);
        }
        user.setRoles(roles);

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
        userProfile.setUser(user);

        return userProfileRepository.save(userProfile);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
