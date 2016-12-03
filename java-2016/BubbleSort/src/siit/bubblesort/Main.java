package siit.bubblesort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		BubbleSort sortAlg = new BubbleSort();

		Integer[] numbers = new Integer[] { 10, 23, 9, 52, 124, 24, 2, 0, 63 };
		Integer[] numbersSorted = sortAlg.sortPrimitives(numbers);
		System.out.println(Arrays.toString(numbersSorted));

		Employee[] employees = new Employee[] { new Employee("Frank", 569856), new Employee("Jesper", 2356830),
				new Employee("Kasper", 1523598), new Employee("Dennis", 4589627), new Employee("Kristine", 4256328),
				new Employee("Anne", 5896012) };
		Employee[] employeesSorted = sortAlg.sortEmployees(employees, Employee.EMPLOYEE_COMP);
		System.out.println(Arrays.toString(employeesSorted));
	}
}
