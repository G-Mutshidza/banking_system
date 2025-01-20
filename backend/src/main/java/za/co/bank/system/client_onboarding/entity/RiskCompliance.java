package za.co.bank.system.client_onboarding.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_risk_compliance")
public class RiskCompliance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isPoliticallyExposedPerson;
    private boolean isSanctioned;
    private String amlRiskLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPoliticallyExposedPerson() {
        return isPoliticallyExposedPerson;
    }

    public void setPoliticallyExposedPerson(boolean politicallyExposedPerson) {
        isPoliticallyExposedPerson = politicallyExposedPerson;
    }

    public boolean isSanctioned() {
        return isSanctioned;
    }

    public void setSanctioned(boolean sanctioned) {
        isSanctioned = sanctioned;
    }

    public String getAmlRiskLevel() {
        return amlRiskLevel;
    }

    public void setAmlRiskLevel(String amlRiskLevel) {
        this.amlRiskLevel = amlRiskLevel;
    }
}
