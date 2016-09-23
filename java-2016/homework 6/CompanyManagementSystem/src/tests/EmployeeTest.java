package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import companyMngSystem.Employee;

public class EmployeeTest {

	@Test
	public void test() {

		Employee employee = new Employee("Bill", 4, "senior", true);

		if (employee instanceof Employee) {
			assertEquals("Bill", employee.getName());
			assertEquals(4, employee.getYearsInCompany());
			assertEquals("senior", employee.getRole());
			assertEquals(true, employee.getParking());

		}
	}

}
