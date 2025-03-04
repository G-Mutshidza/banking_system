package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Verification;
import za.co.bank.system.client_onboarding.repository.VerificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VerificationService {

    private final VerificationRepository verificationRepository;

    @Autowired
    public VerificationService(VerificationRepository verificationRepository) {
        this.verificationRepository = verificationRepository;
    }

    // Create a new verification record
    public Verification createVerification(Verification verification) {
        return verificationRepository.save(verification);
    }

    // Get all verification records
    public List<Verification> getAllVerifications() {
        return verificationRepository.findAll();
    }

    // Get verification by ID
    public Optional<Verification> getVerificationById(Long id) {
        return verificationRepository.findById(id);
    }

    // Update an existing verification record
    public Verification updateVerification(Verification verification) {
        return verificationRepository.save(verification);
    }

    // Delete a verification record
    public void deleteVerification(Long id) {
        verificationRepository.deleteById(id);
    }
}