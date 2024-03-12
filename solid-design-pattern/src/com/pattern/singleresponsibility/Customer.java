package com.pattern.singleresponsibility;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Due to single responsibility
    //methods for storing customer in DB & report generation are implemented in separate class
}
