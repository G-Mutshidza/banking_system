package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String maritalStatus;
    private String contactNumber;
    private String emailAddress;
    private Address residentialAddress;
    private Identification identification;
    private EmploymentInfo employmentInfo;
    private Account account;
    private Security security;
    private Consent consent;
    private boolean isPoliticallyExposedPerson;


}
