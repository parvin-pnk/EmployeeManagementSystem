package com.praveen.employee_management.service;

import java.util.List;

import com.praveen.employee_management.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployee(Long id);
}
