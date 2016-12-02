import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests {
	@Test(expected = IllegalArgumentException.class)
	public void NoEmployeeTest() {
		// given
		ManagementSystem ms = new ManagementSystem();

		// when
		List<Employee> employeeNoParkingSpace = new ArrayList<>();
		employeeNoParkingSpace = ms.getList();

		// then
		List<Employee> expectedList = new ArrayList<Employee>();
		assertTrue(employeeNoParkingSpace.equals(expectedList));

	}

	@Test(expected = IllegalArgumentException.class)
	public void AllEmployeesHaveParking() {
		// given
		ManagementSystem ms = new ManagementSystem();
		ms.addEmployee(new Employee("Joy", 3, "tester", true));
		ms.addEmployee(new Employee("Mark", 5, "dev", true));

		// when
		List<Employee> employeeNoParkingSpace = new ArrayList<>();
		employeeNoParkingSpace = ms.getList();

		// then
		List<Employee> expectedList = new ArrayList<Employee>();
		assertTrue(employeeNoParkingSpace.equals(expectedList));

	}

}
