package com.example.orders;

public class OrderNotFoundException extends RuntimeException {
    
    OrderNotFoundException(Long id) {
        super("Could not find the order " + id);
    }    
}
