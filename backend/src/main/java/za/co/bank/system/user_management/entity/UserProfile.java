package za.co.bank.system.user_management.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Entity
@Document(collection = "user_details")
@Data
public class UserProfile {

    @Id
    private Long id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("first_name")
    private LocalDate dateOfBirth;

    @Field("first_name")
    private String idNumber;

    @Field("first_name")
    private String address;

    @Field("first_name")
    private String phoneNumber;

    @Field("user_id")
    private String userId;

}
