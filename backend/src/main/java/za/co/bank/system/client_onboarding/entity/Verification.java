package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_verification")
public class Verification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentType;
    private String documentNumber;
    private boolean isDocumentVerified;
    private boolean isAddressVerified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public boolean isDocumentVerified() {
        return isDocumentVerified;
    }

    public void setDocumentVerified(boolean documentVerified) {
        isDocumentVerified = documentVerified;
    }

    public boolean isAddressVerified() {
        return isAddressVerified;
    }

    public void setAddressVerified(boolean addressVerified) {
        isAddressVerified = addressVerified;
    }
}
