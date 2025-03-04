package za.co.bank.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {
		"za.co.bank.system.user_management",
		"za.co.bank.system.configurations",
		"za.co.bank.system.security",
		"za.co.bank.system.controller",
		"za.co.bank.system.service"
})
@EnableJpaRepositories(basePackages = {
		"za.co.bank.system.user_management.repository"
})
@EntityScan(basePackages = {
		"za.co.bank.system.user_management.entity"
})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
