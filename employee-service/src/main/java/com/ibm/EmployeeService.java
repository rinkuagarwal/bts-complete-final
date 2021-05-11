package com.ibm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String createEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee.getId();
	}
	public Optional<Employee> getEmployeeById(String EmployeeId) {
		return employeeRepository.findById(EmployeeId);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public void updateEmployeeDetails(Employee employee) {
		employeeRepository.save(employee);
	}
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	

}
