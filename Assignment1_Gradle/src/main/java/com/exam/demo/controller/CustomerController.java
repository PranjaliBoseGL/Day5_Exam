package com.exam.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.demo.model.Customer;
import com.exam.demo.repository.CustomerRepo;
import java.util.List;




@RestController

public class CustomerController

{

 @Autowired

 CustomerRepo repo;


 @PostMapping(path="/customer",consumes= {"application/json"})

 public Customer addCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

 @GetMapping(path="/customers")

 public List<Customer> getCustomers()

 {

 return repo.findAll();

 }

 @RequestMapping("/customer/{id}")

 public Optional<Customer> getCustomer(@PathVariable("id")int id)

 {

 return repo.findById(id);

 }

 @DeleteMapping("/customer/{id}")

 public String deleteCustomer(@PathVariable int id)

 {

	 Customer a = repo.getOne(id);

 repo.delete(a);

 return "deleted";

 }

 @PutMapping(path="/customer",consumes= {"application/json"})

 public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

}









