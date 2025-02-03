package za.co.bank.system.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.bank.system.user_management.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
