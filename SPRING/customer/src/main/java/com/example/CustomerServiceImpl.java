package com.example.service;


import java.util.ArrayList;
import java.util.List;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
    
    private CustomerRepository customerRepo; 

    public CustomerServiceImpl(){
    }

    public CustomerServiceImpl(CustomerRepository repository){
        this.customerRepo = repository;
    }

    public CustomerRepository getCustomerRepository(){
        return this.customerRepo;
    }

    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepo = customerRepository;
    }

    public List<Customer> findAll(){
        return this.customerRepo.findAll();
    }

    public Customer createCustomer(String firstname, String lastname){
        Customer newCustomer = new Customer(firstname, lastname); 
        this.customerRepo.addCustomer(newCustomer);
        return newCustomer;
    }
}
