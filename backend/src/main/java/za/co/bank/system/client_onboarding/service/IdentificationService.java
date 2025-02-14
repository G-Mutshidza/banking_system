package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.EmploymentInfo;
import za.co.bank.system.client_onboarding.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Component
public class IdentificationService implements CommandLineRunner {

    @Autowired
    private IdentificationService identificationService;
}