package com.praveen.employee_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.praveen.employee_management.entity.Employee;
import com.praveen.employee_management.repositary.EmployeeRepositary;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	@Autowired
	private EmployeeRepositary employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Employee emp1= new Employee("Praveen","Kumar","praveenkumar5pnk@gmail.com");
		employeeRepository.save(emp1);
		
		Employee emp2 = new Employee("Anaa","Viyonci","anaa@gmail.com");
		employeeRepository.save(emp2);
		
		Employee emp3 = new Employee("Sathya","Sri","sathya@gmail.com");
		employeeRepository.save(emp3);
		*/
		
		
	}

}
