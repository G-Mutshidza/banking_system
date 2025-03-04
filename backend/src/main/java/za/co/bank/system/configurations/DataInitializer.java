package za.co.bank.system.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import za.co.bank.system.user_management.entity.Role;
import za.co.bank.system.user_management.repository.RoleRepository;

public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Autowired
    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        if (roleRepository.count() == 0) {
            roleRepository.save(new Role("ADMIN"));
            roleRepository.save(new Role("BANKER"));
            roleRepository.save(new Role("CLIENT"));
        }
    }
}
