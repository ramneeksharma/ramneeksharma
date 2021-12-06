package com.example.service; 

import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public interface CustomerService {

    public CustomerRepository getCustomerRepository();

    public void setCustomerRepository(CustomerRepository customerRepository);
    
    public List<Customer> findAll();

    public Customer createCustomer(String firstname, String lastname); 


}
