package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Security;
import za.co.bank.system.client_onboarding.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SecurityService {

    private final SecurityRepository securityRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    // Create a new security record
    public Security createSecurity(Security security) {
        return securityRepository.save(security);
    }

    // Get all security records
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    // Get security by ID
    public Optional<Security> getSecurityById(Long id) {
        return securityRepository.findById(id);
    }

    // Update an existing security record
    public Security updateSecurity(Security security) {
        return securityRepository.save(security);
    }

    // Delete a security record
    public void deleteSecurity(Long id) {
        securityRepository.deleteById(id);
    }
}