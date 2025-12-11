package com.example.bilabonnement.dataRegistration.service;

import com.example.bilabonnement.dataRegistration.model.Customer;
import com.example.bilabonnement.dataRegistration.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepository;

    public CustomerService(CustomerRepo customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listAllCustomers() {
        return customerRepository.findAllCustomers();
    }

    //Hent detaljer om specifik customer ud fra id:
    public Optional<Customer> findCustomerById(int customerID) {
        return customerRepository.findById(customerID);
    }
}
