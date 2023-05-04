package com.example.springcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}