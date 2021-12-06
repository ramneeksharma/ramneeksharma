package com.example.model;

import java.util.Objects; 
import java.util.UUID;

public class Customer {
    
    private UUID id;
    private String firstName;
    private String lastName;

    public Customer(){
        this.id = UUID.randomUUID();
    }

    public Customer(String firstname, String lastname){
        this.id = UUID.randomUUID();
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFirstName(){
        return this.firstName; 
    }

    public String getLastName(){
        return this.lastName; 
    }

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Customer))
            return false;
        Customer customer = (Customer) o;
        return Objects.equals(this.id, customer.id) 
            && Objects.equals(this.firstName, customer.firstName)
            && this.lastName == customer.lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName);
    }

    @Override
    public String toString() {
        return  "Customer{" + 
                "id=" + this.id + 
                ", firstname='" + this.firstName + ' ' + 
                ", lastname=" + this.lastName + '}';
    }
}
