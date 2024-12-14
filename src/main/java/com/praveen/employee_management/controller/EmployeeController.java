package com.praveen.employee_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.praveen.employee_management.entity.Employee;
import com.praveen.employee_management.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// Handler Method (handle list and return mode and view)
	@GetMapping("/employees")
	public String ListEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}

	@GetMapping("/employees/new")
	public String CreateEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create-employee.html";
	}

	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees/edit/{id}")
	public String EditEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "edit-employee.html";
	}

	@PostMapping("/employees/{id}")
	public String EditEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
		Employee existingEmployee = employeeService.getEmployeeById(id);
		existingEmployee.setEmpid(id);
		existingEmployee.setFirstname(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		existingEmployee.setEmail(employee.getEmail());
		employeeService.updateEmployee(existingEmployee);
		return "redirect:/employees";

	}
	
	@GetMapping("/employees/{id}")
	public String DeleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
		
	}
}
