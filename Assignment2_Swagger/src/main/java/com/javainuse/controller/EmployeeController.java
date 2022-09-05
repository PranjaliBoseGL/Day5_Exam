package com.javainuse.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

//import net.javaguides.springboot.exception.ResourceNotFoundException;
import com.javainuse.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	 @Autowired
	    private EmployeeRepository employeeRepository;
	    
	 
	 @RequestMapping(value="/employee", method= RequestMethod.GET, produces = "application/json")
	 
	    public List<Employee> getAllEmployees(){
	        return employeeRepository.findAll();
	    }        
	    
	    // create employee rest api
	    @PostMapping
	    public Employee getData(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }
	    
	    // get employee by id rest api
	    @GetMapping("/employee/{id}")
	   public Optional<Employee>getEmployeeById(@PathVariable("id") int id){
	    	Optional<Employee> emp=employeeRepository.findById(id);
	    	return emp;
	    }
	   
	   
	   
	   
	    // update employee rest api
	    
	    @PutMapping("/employee/{id}")
	    public Employee getUpdate(@PathVariable("id") int id, @RequestBody Employee employee) {
	    	Optional<Employee> emp=employeeRepository.findById(id);
	    	return employeeRepository.save(employee);
	    }
	   
	    
	    // delete employee rest api
	    @DeleteMapping("/employee/{id}")
	    public void delete(@PathVariable("id")  int id) {
	    	employeeRepository.deleteById(id);
	    }
	   

	
}



