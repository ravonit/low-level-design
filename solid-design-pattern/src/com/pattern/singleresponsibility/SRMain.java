package com.pattern.singleresponsibility;

public class SRMain {
    public static void main(String[] args){
        Customer c1 = new Customer("Ravi");
        CustomerDB customerDB = new CustomerDB();
        CustomerReport report = new CustomerReport();
        report.generateCustomerReport(c1);
        customerDB.storeCustomer(c1);
    }
}
