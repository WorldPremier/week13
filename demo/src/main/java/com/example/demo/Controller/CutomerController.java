package com.example.demo.Controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CutomerController {
    //this repository is described as a dependency of controller
    //we need to inject it tinot our controller for it to work
    //we can do this easily with the autowired annotation.
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/all")
    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

}
