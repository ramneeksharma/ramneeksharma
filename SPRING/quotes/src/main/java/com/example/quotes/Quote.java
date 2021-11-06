package com.example.quotes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    
    private String type;
    private QuoteValue value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuoteValue getValue() {
        return value;
    }

    public void setValue(QuoteValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}';
    }
}
