package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public class CustomerRespositoryImpl implements CustomerRepository{

    List<Customer> customers;

    public void CustomerRespositoryImpl(){
        this.customers = new ArrayList<Customer>();
    }

    public void CustomerRespositoryImpl(List<Customer> customers){
        this.customers = customers;
    }

    public List<Customer> findAll(){
        return customers;
    }
    
}