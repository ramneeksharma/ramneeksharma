package com.example.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.customer.AppConfig;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

import java.util.function.Consumer;

/**
 * Main file for the Customer Application
 */
public class CustomerApplication
{
    public static void main( String[] args )
    {
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
        try {
            CustomerRepository customerRepository = new CustomerRepositoryImpl(); 
            CustomerService customerService = new CustomerServiceImpl();
            customerService.setCustomerRepository(customerRepository);
            customerService.createCustomer("John", "Doe");
            customerService.createCustomer("Jane", "Doe");

            for (Customer customer : customerService.findAll()) {
                System.out.println(customer);
            }

            Consumer<Customer> printCustomers = ( customer ) -> { 
                System.out.println(customer); 
            }; 

            customerService.findAll().forEach(printCustomers);
           
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
