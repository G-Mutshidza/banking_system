package za.co.bank.system.client_onboarding.repository;

import za.co.bank.system.client_onboarding.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>{   
}