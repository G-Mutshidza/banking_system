package za.co.bank.system.user_management.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class UserDetailsDTO {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String idNumber;
    private String address;
    private String phoneNumber;

}
