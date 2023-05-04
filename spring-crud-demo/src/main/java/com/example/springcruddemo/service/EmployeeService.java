package com.example.springcruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcruddemo.dao.EmployeeRepository;
import com.example.springcruddemo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired(required=true)
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}

	public Employee fetchEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employee> fetchEmployees() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		Employee oldEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		if (oldEmployee != null) {
			oldEmployee.setName(employee.getName());
			oldEmployee.setAddress(employee.getAddress());
			return employeeRepository.save(employee);
		}
		return employeeRepository.save(new Employee());
	}

	public String deleteById(int id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted";
	}
}
