package com.avsoft.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avsoft.employee.entity.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
