package com.avsoft.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.employee.entity.Employee;
import com.avsoft.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		employeeService.saveEmp(emp);
		return "Created";
	}
	
	@GetMapping("/employee/{id}")
	public Employee viewEmployee(@PathVariable("id") int id) {
		return employeeService.viewEmployee(id);
	}
	@DeleteMapping("/delete/{id}")
     public String deleteEmployee(@PathVariable("id")int id) {
		employeeService.deleteEmp(id);
		return "Employee Deleted..";
	}
}
