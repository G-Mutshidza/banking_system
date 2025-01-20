package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountType;
    private String preferredCurrency;
    private String accountPurpose; // Personal, Business, Investment
    private String accountHolderRole; // Primary, Joint Account, Beneficiary, etc

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    public void setPreferredCurrency(String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }

    public String getAccountPurpose() {
        return accountPurpose;
    }

    public void setAccountPurpose(String accountPurpose) {
        this.accountPurpose = accountPurpose;
    }

    public String getAccountHolderRole() {
        return accountHolderRole;
    }

    public void setAccountHolderRole(String accountHolderRole) {
        this.accountHolderRole = accountHolderRole;
    }
}
