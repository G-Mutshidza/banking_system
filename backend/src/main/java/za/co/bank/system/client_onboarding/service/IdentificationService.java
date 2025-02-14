package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Identification;
import za.co.bank.system.client_onboarding.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IdentificationService {

    private final IdentificationRepository identificationRepository;

    @Autowired
    public IdentificationService(IdentificationRepository identificationRepository) {
        this.identificationRepository = identificationRepository;
    }

    // Create a new employment info record
    public Identification createIdentification(Identification employmentInfo) {
        return identificationRepository.save(employmentInfo);
    }

    // Get all employment info records
    public List<Identification> getAllIdentification() {
        return identificationRepository.findAll();
    }

    
    // Get employment info by ID
    public Optional<Identification> getIdentificationById(Long id) {
        return identificationRepository.findById(id);
    }

    
    // Update an existing employment info record
    public Identification updateIdentification(Identification identification) {
        return identificationRepository.save(identification);
    }

}