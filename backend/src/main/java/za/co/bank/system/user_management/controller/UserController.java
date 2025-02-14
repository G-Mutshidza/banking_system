package za.co.bank.system.user_management.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.bank.system.user_management.dto.SignUpDTO;
import za.co.bank.system.user_management.dto.UserDetailsDTO;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.entity.UserProfile;
import za.co.bank.system.user_management.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "sign-up")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created the user"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<User> signUp(@RequestBody SignUpDTO signUpDTO) {
        User user = userService.registerUser(signUpDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping(value = "add-details/{userId}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created the user"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<?> addUserDetails(@PathVariable String userId, @RequestBody UserDetailsDTO userDetailsDTO) {
        try {
            User user = userService.getUserById(userId);
            UserProfile userProfile = userService.addUserDetails(userDetailsDTO, user);

            return ResponseEntity.status(HttpStatus.CREATED).body(userProfile);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding user details");
        }

    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created the user"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User user = userService.getUserById(id);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }



}
