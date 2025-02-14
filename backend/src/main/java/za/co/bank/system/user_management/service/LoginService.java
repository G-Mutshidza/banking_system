package za.co.bank.system.user_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.bank.system.security.JwtUtilities;
import za.co.bank.system.user_management.repository.UserRepository;

@Service
public class LoginService {
    private final UserRepository userRepository;
    private final PasswordEncoder pwdEncoder;
    private final AuthenticationManager authManager;
    private final JwtUtilities jwtUtils;

    @Autowired
    public LoginService(@Qualifier("mongoUserRepository") UserRepository userRepo, PasswordEncoder pwdEncoder, AuthenticationManager authManager, JwtUtilities jwtUtils) {
        this.userRepository = userRepo;
        this.pwdEncoder = pwdEncoder;
        this.authManager = authManager;
        this.jwtUtils = jwtUtils;
    }

    public String loginUser(String username, String password) {

        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, pwdEncoder.encode(password))
        );

        if (auth.isAuthenticated()) {
            return jwtUtils.generateToken(username);
        } else {
            throw new IllegalArgumentException("Invalid Credentials");
        }
    }

}
