package za.co.bank.system.user_management.dto;

import lombok.Data;

import java.util.Set;

@Data
public class SignUpDTO {

    private String username;
    private String email;
    private String password;
    private Set<String> roleNames;
}
