package com.fico.ems.service;

import java.util.List;

import com.fico.ems.model.Employee;

public interface EmployeeService {
public Employee findEmployeeByEmail(String email);
public List<Employee> getAllEmployee();
public void saveEmployee(Employee employee);
public void deleteEmployee(Employee employee);
}
