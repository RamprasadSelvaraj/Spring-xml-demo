package com.spring.repository;

import com.spring.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.ArrayList;

public class CustomerRepositoryImpl implements CustomerRepository{

    @Value("${dbUsername}")
    private  String username;

    public List<Customer> getInfo(){
        System.out.println(username);
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ramprasad");
        customer.setLastName("Selvaraj");
        ((ArrayList) customerList).add(customer);
        return customerList;
    }
}
