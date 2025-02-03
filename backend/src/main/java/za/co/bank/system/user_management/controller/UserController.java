package za.co.bank.system.user_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.bank.system.user_management.dto.SignUpDTO;
import za.co.bank.system.user_management.dto.UserDetailsDTO;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.entity.UserDetails;
import za.co.bank.system.user_management.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("sign-up")
    public ResponseEntity<User> signUp(@RequestBody SignUpDTO signUpDTO) {
        User user = userService.registerUser(signUpDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("add-details/{userId}")
    public ResponseEntity<UserDetails> addUserDetails(@PathVariable Long userId, @RequestBody UserDetailsDTO userDetailsDTO) {
        Optional<User> user = userService.getUserById(userId);
        UserDetails userDetails = userService.addUserDetails(userDetailsDTO, user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userDetails);
    }



}
