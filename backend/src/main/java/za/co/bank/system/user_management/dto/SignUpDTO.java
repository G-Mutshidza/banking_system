package za.co.bank.system.user_management.dto;

import lombok.Data;

@Data
public class SignUpDTO {

    private String username;
    private String email;
    private String password;
}
