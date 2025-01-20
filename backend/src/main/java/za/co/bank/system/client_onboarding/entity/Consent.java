package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_consents")
public class Consent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean consentToTermsAndConditions;
    private boolean consentToPrivacyPolicy;
    private boolean consentForDataSharing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isConsentToTermsAndConditions() {
        return consentToTermsAndConditions;
    }

    public void setConsentToTermsAndConditions(boolean consentToTermsAndConditions) {
        this.consentToTermsAndConditions = consentToTermsAndConditions;
    }

    public boolean isConsentToPrivacyPolicy() {
        return consentToPrivacyPolicy;
    }

    public void setConsentToPrivacyPolicy(boolean consentToPrivacyPolicy) {
        this.consentToPrivacyPolicy = consentToPrivacyPolicy;
    }

    public boolean isConsentForDataSharing() {
        return consentForDataSharing;
    }

    public void setConsentForDataSharing(boolean consentForDataSharing) {
        this.consentForDataSharing = consentForDataSharing;
    }
}
