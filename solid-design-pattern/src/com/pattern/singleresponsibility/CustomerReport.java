package com.pattern.singleresponsibility;

public class CustomerReport {
    public void generateCustomerReport(Customer c){
        System.out.println("Successfully report generated for " + c.getName());
    }
}
