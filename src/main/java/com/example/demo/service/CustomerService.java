package com.example.demo.service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Product;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(String name, String surname ,int age, String email){
        Customer customer = new Customer(name,surname,age,email,BigDecimal.ZERO);
        return customerRepository.save(customer);
    }

    public Product buyProduct(Customer customer, long productId){

    }

}
