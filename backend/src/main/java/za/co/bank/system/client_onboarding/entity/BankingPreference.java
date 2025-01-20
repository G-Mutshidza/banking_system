package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_banking_preferences")
public class BankingPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean prefersPaperStatements;
    private boolean smsNotificationEnabled;
    private boolean emailNotificationEnabled;
    private String preferredLanguage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPrefersPaperStatements() {
        return prefersPaperStatements;
    }

    public void setPrefersPaperStatements(boolean prefersPaperStatements) {
        this.prefersPaperStatements = prefersPaperStatements;
    }

    public boolean isSmsNotificationEnabled() {
        return smsNotificationEnabled;
    }

    public void setSmsNotificationEnabled(boolean smsNotificationEnabled) {
        this.smsNotificationEnabled = smsNotificationEnabled;
    }

    public boolean isEmailNotificationEnabled() {
        return emailNotificationEnabled;
    }

    public void setEmailNotificationEnabled(boolean emailNotificationEnabled) {
        this.emailNotificationEnabled = emailNotificationEnabled;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
}
