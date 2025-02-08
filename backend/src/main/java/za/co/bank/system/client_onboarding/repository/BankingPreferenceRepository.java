package za.co.bank.system.client_onboarding.repository;

import za.co.bank.system.client_onboarding.entity.BankingPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingPreferenceRepository extends JpaRepository<BankingPreference, Long> {
}