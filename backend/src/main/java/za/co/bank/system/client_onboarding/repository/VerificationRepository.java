package za.co.bank.system.client_onboarding.repository;

import za.co.bank.system.client_onboarding.entity.Verification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationRepository extends JpaRepository<Verification, Long>{   
}