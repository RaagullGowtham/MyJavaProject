package com.example.springcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcruddemo.entity.Employee;
import com.example.springcruddemo.service.EmployeeService;

@RestController
	public class EmployeeController {
		@Autowired
		private EmployeeService employeeService;

		@PostMapping("/addEmployee")
		public Employee addEmployee(@RequestBody Employee employee) {
			return employeeService.saveEmployee(employee);
		}

		@PostMapping("/addEmployees")
		public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
			return employeeService.saveEmployees(employees);
		}

		@GetMapping("/employee/{id}")
		public Employee getUser(@PathVariable int id) {
			return employeeService.fetchEmployeeById(id);
		}

		@GetMapping("/employees")
		public List<Employee> getAllEmployees() {
			return employeeService.fetchEmployees();
		}

		@PutMapping("/updateEmployee")
		public Employee updateEmployee(@RequestBody Employee employee) {
			return employeeService.updateEmployee(employee);
		}

		@DeleteMapping("/employee/{id}")
		public String removeUser(@PathVariable int id) {
			return employeeService.deleteById(id);
		}
	}


