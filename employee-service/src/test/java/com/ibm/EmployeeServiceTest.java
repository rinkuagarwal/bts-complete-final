package com.ibm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeServiceTest {

	@Test
	void testCreateEmployee() {
		EmployeeService employeeService = new EmployeeService();
		EmployeeRepository dummyRepo = new DummyEmployeeRepository();
		employeeService.setEmployeeRepository(dummyRepo);
		Employee employee = new Employee();
		String employeeId = employeeService.createEmployee(employee);
		assertNotNull(employeeId);

	}
/*/
	@Test
	void testGetEmployeeById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmployees() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateEmployeeDetails() {
		fail("Not yet implemented");
	}
/*/
}
