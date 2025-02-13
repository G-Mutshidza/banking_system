package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.BankingPreference;
import za.co.bank.system.client_onboarding.repository.BankingPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BankingPreferenceService {

    private final BankingPreferenceRepository bankingPreferenceRepository;

    @Autowired
    public BankingPreferenceService(BankingPreferenceRepository bankingPreferenceRepository) {
        this.bankingPreferenceRepository = bankingPreferenceRepository;
    }

    // Create a new banking preference
    public BankingPreference createBankingPreference(BankingPreference bankingPreference) {
        return bankingPreferenceRepository.save(bankingPreference);
    }

    // Get all banking preferences
    public List<BankingPreference> getAllBankingPreferences() {
        return bankingPreferenceRepository.findAll();
    }

    // Get banking preference by ID
    public Optional<BankingPreference> getBankingPreferenceById(Long id) {
        return bankingPreferenceRepository.findById(id);
    }

    // Update an existing banking preference
    public BankingPreference updateBankingPreference(BankingPreference bankingPreference) {
        return bankingPreferenceRepository.save(bankingPreference);
    }

    // Delete a banking preference
    public void deleteBankingPreference(Long id) {
        bankingPreferenceRepository.deleteById(id);
    }
}