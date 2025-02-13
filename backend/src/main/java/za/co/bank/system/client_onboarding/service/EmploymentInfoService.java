package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.EmploymentInfo;
import za.co.bank.system.client_onboarding.repository.EmploymentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmploymentInfoService {

    private final EmploymentInfoRepository employmentInfoRepository;

    @Autowired
    public EmploymentInfoService(EmploymentInfoRepository employmentInfoRepository) {
        this.employmentInfoRepository = employmentInfoRepository;
    }

    // Create a new employment info record
    public EmploymentInfo createEmploymentInfo(EmploymentInfo employmentInfo) {
        return employmentInfoRepository.save(employmentInfo);
    }

    // Get all employment info records
    public List<EmploymentInfo> getAllEmploymentInfo() {
        return employmentInfoRepository.findAll();
    }

    // Get employment info by ID
    public Optional<EmploymentInfo> getEmploymentInfoById(Long id) {
        return employmentInfoRepository.findById(id);
    }

    // Update an existing employment info record
    public EmploymentInfo updateEmploymentInfo(EmploymentInfo employmentInfo) {
        return employmentInfoRepository.save(employmentInfo);
    }

    // Delete an employment info record
    public void deleteEmploymentInfo(Long id) {
        employmentInfoRepository.deleteById(id);
    }
}