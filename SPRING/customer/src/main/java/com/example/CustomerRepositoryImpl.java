package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository{

    List<Customer> customers;

    public CustomerRepositoryImpl(){
        this.customers = new ArrayList<Customer>();
    }

    public CustomerRepositoryImpl(List<Customer> customers){
        this.customers = customers;
    }

    public List<Customer> findAll(){
        return customers;
    }
    
    public void addCustomer(Customer customer){
        this.customers.add(customer); 
    }
}