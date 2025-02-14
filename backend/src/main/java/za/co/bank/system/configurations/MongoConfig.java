package za.co.bank.system.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("za.co.bank.system.user_management.repository")
public class MongoConfig {
}
