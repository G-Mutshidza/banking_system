package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Client;
import za.co.bank.system.client_onboarding.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Create a new client
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    // Get all clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Get client by ID
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    // Update an existing client
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    // Delete a client
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}