package com.example.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
    
    @Bean(name = "customerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public CustomerService getCustomerService() {
        CustomerService service = new CustomerServiceImpl(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new CustomerRepositoryImpl();
    }

}
