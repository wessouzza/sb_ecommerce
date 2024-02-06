package com.ecommerce.shoppy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.shoppy.dto.CustomerDto;
import com.ecommerce.shoppy.entities.Customer;
import com.ecommerce.shoppy.repositories.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService{

    private final CustomerRepository customerRepository;
    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(CustomerDto customer) {
        Customer newCustomer = new Customer();
        newCustomer.setName(customer.getName());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setPassword(customer.getPassword());
        newCustomer.setAddress(customer.getAddress());
        newCustomer.setPhone(customer.getPhone());
            
        return customerRepository.save(newCustomer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getOneById(long Id) {
        return  customerRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException("Customer not found!"));
    }
    
}