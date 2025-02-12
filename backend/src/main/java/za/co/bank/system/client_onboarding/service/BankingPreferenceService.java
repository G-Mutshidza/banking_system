package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.BankingPreference;
import za.co.bank.system.client_onboarding.repository.BankingPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankingPreferenceService {

    private final BankingPreferenceRepository bankingPreferenceService;

    @Autowired
    public BankingPreferenceService(BankingPreferenceRepository bankingPreferenceService) {
        this.bankingPreferenceService = bankingPreferenceService;
    }

    public void run(String... args) throws Exception {
        // Create a new banking preference
        BankingPreference preference = new BankingPreference();
        preference.setPrefersPaperStatements(false);
        preference.setSmsNotificationEnabled(true);
        preference.setEmailNotificationEnabled(true);
        preference.setPreferredLanguage("en");
    }
}
        // BankingPreference savedPreference = bankingPreferenceService.createBankingPreference(preference);
        // System.out.println("Created Banking Preference with ID: " + savedPreference.getId());
    
    //     // Retrieve all banking preferences
    //     List<BankingPreference> allPreferences = bankingPreferenceService.getAllBankingPreferences();
    //     System.out.println("All Banking Preferences: " + allPreferences);

    //     // Update an existing banking preference
    //     BankingPreference updatedPreference = bankingPreferenceService.getBankingPreferenceById(savedPreference.getId())
    //             .orElseThrow(() -> new RuntimeException("Banking Preference not found"));
    //     updatedPreference.setPreferredLanguage("fr");
    //     bankingPreferenceService.updateBankingPreference(updatedPreference);
    //     System.out.println("Updated Preferred Language to: " + updatedPreference.getPreferredLanguage());

    //     // Delete a banking preference
    //     bankingPreferenceService.deleteBankingPreference(savedPreference.getId());
    //     System.out.println("Deleted Banking Preference with ID: " + savedPreference.getId());
    // }
// }