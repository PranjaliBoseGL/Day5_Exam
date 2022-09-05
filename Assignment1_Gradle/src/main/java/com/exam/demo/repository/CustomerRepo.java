package com.exam.demo.repository;

import com.exam.demo.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository

public interface CustomerRepo extends JpaRepository<Customer, Integer> {



}
