package com.praveen.employee_management.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.employee_management.entity.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee,Long> {
	
	
}
