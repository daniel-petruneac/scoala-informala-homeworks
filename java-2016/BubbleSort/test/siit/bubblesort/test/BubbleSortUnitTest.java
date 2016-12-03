package siit.bubblesort.test;

import org.junit.Test;

import siit.bubblesort.BubbleSort;
import siit.bubblesort.Employee;

import static org.junit.Assert.*;

public class BubbleSortUnitTest {

	@Test
	public void numbersSort() {
		Integer[] testList = new Integer[] { 0, 2, 9, 10, 23, 24, 52, 63, 124 };

		BubbleSort sortAlg = new BubbleSort();
		Integer[] numbers = new Integer[] { 10, 23, 9, 52, 124, 24, 2, 0, 63};
		Integer[] sortedNumbers = sortAlg.sortPrimitives(numbers);

		assertArrayEquals(testList, sortedNumbers);
	}


	@Test
	public void employeesSort() {
		Employee[] testEmployees = new Employee[] { new Employee("Anne", 5896012), new Employee("Dennis", 4589627), new Employee("Frank", 569856),
				new Employee("Jesper", 2356830), new Employee("Kasper", 1523598), new Employee("Kristine", 4256328) };

		BubbleSort sortAlg = new BubbleSort();
		Employee[] employees = new Employee[] { new Employee("Frank", 569856), new Employee("Jesper", 2356830),
				new Employee("Kasper", 1523598), new Employee("Dennis", 4589627), new Employee("Kristine", 4256328),
				new Employee("Anne", 5896012) };
		Employee[] sortedEmployees = sortAlg.sortEmployees(employees, Employee.EMPLOYEE_COMP);
		
		assertArrayEquals(testEmployees, sortedEmployees);

	}

}
