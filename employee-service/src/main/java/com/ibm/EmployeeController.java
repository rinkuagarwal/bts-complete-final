package com.ibm;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeService employeeService;


	/**
	 * validation
	 * 
	 * @param bindingResult
	 */
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("something went wrong, please try again");
		}
	}
	/**
	 * method to create employee
	 * 
	 * @param employee
	 * @param bindingResult
	 * @return the id
	 */

	@PostMapping("/employee")
	String createEmployee(@RequestBody @Valid Employee employee, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(employee);
		return employeeService.createEmployee(employee);
	}
	/**
	 * method to search employeeId
	 * 
	 * @param employeeId
	 * @return zero or matchingId
	 */
	@GetMapping("/employee/{id}")
	Optional<Employee> getEmployeeById(@PathVariable("id") String employeeId) {
		return   employeeService.getEmployeeById(employeeId);
	}

	@GetMapping("/employee")
	List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	/**
	 * updates the changes in Employee
	 * 
	 * @param employeeId
	 * @param employee
	 * @param bindingResult
	 */
	@PutMapping("/employee/{id}")
	void updateEmployee(@RequestBody @Valid Employee employee, @PathVariable("id") String employeeId, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(employeeId);
		employee.setId(employeeId);
		employeeService.updateEmployeeDetails(employee);
	}
}

