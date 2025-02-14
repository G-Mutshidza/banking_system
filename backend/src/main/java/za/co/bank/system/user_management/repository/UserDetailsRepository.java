package za.co.bank.system.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import za.co.bank.system.user_management.entity.UserProfile;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserProfile, String> {
}
