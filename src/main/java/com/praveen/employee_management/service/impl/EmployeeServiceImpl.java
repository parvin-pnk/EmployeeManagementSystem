package com.praveen.employee_management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.praveen.employee_management.entity.Employee;
import com.praveen.employee_management.repositary.EmployeeRepositary;
import com.praveen.employee_management.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	private EmployeeRepositary employeeRepository;
	public EmployeeServiceImpl(EmployeeRepositary employeeRepository) {
		super();
		this.employeeRepository=employeeRepository;
	}
	

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}
	
	
	
	
	

}
