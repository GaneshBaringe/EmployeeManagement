package com.avsoft.employee.service;

import com.avsoft.employee.entity.Employee;

public interface EmployeeService {
	
	public void saveEmp(Employee emp);
	public void deleteEmp(int id);
	public Employee viewEmployee(int id);

}
