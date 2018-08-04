package com.spring.service;

import com.spring.repository.CustomerRepository;
import com.spring.repository.CustomerRepositoryImpl;
import com.spring.model.Customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getInfo() {
        return customerRepository.getInfo();
    }
}
