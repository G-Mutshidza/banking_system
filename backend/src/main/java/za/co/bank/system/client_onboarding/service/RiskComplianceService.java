package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.RiskCompliance;
import za.co.bank.system.client_onboarding.repository.RiskComplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RiskComplianceService {

    private final RiskComplianceRepository riskComplianceRepository;

    @Autowired
    public RiskComplianceService(RiskComplianceRepository riskComplianceRepository) {
        this.riskComplianceRepository = riskComplianceRepository;
    }

    // Create a new risk compliance record
    public RiskCompliance createRiskCompliance(RiskCompliance riskCompliance) {
        return riskComplianceRepository.save(riskCompliance);
    }

    // Get all risk compliance records
    public List<RiskCompliance> getAllRiskCompliance() {
        return riskComplianceRepository.findAll();
    }

    // Get risk compliance by ID
    public Optional<RiskCompliance> getRiskComplianceById(Long id) {
        return riskComplianceRepository.findById(id);
    }

    // Update an existing risk compliance record
    public RiskCompliance updateRiskCompliance(RiskCompliance riskCompliance) {
        return riskComplianceRepository.save(riskCompliance);
    }

    // Delete a risk compliance record
    public void deleteRiskCompliance(Long id) {
        riskComplianceRepository.deleteById(id);
    }
}