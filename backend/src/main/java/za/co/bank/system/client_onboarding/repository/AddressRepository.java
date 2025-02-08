package za.co.bank.system.client_onboarding.repository;

import za.co.bank.system.client_onboarding.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}