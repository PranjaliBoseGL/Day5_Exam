package com.javainuse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}