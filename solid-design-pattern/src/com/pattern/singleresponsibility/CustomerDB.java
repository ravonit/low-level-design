package com.pattern.singleresponsibility;

public class CustomerDB {
    public void storeCustomer(Customer c){
        System.out.println("Storing customer "+ c.getName() + " in DB");
    }
}
