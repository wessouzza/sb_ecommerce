package com.ecommerce.shoppy.services;

import java.util.List;

import com.ecommerce.shoppy.dto.CustomerDto;
import com.ecommerce.shoppy.entities.Customer;

public interface CustomerService {

    public Customer createCustomer(CustomerDto customer);

    public List<Customer>  getAllCustomers();

    public Customer getOneById(long Id);
}