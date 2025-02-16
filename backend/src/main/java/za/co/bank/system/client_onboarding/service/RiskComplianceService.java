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
}