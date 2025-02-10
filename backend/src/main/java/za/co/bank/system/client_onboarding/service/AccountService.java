package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Account;
import za.co.bank.system.client_onboarding.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    // Create a new account:
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    // Get all accounts:
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Get Account by Id:
    public Optional<Account> getAccountById(long AccountId) {
        return accountRepository.findById(AccountId)
    }

    // Update an existing account:
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    // Delete an accoung:
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    } 
}
