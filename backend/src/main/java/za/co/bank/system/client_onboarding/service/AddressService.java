package za.co.bank.system.client_onboarding.service;

import za.co.bank.system.client_onboarding.entity.Address;
import za.co.bank.system.client_onboarding.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    // Create a new address
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    // Get all addresses
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    // Get address by ID
    public Optional<Address> getAddressById(Long addressId) {
        return addressRepository.findById(addressId);
    }

    // Update an existing address
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    // Delete an address
    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);
    }
}