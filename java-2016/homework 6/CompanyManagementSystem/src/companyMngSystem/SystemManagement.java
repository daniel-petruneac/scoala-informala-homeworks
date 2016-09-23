package companyMngSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains the methods used to add, print, compare the employees in
 * order for this application to work.
 * 
 * @author Dani Petruneac
 *
 */
public class SystemManagement {

	private List<Employee> employeeList = new ArrayList<Employee>();
	private List<Employee> managerList = new ArrayList<Employee>();
	private List<Employee> seniorList = new ArrayList<Employee>();
	private List<Employee> juniorList = new ArrayList<Employee>();
	private List<Employee> employeeListWithNoParking = new ArrayList<Employee>();
	private List<Employee> employeeListWithParking = new ArrayList<Employee>();

	/**
	 * The "add" method adds the employee in different lists according to the
	 * employee's properties.
	 * 
	 * @param employee
	 * @throws RoleException
	 *             when the role is different than "manager", "senior" or
	 *             "junior"
	 * @throws YearsInCompanyException
	 *             when the years in company is 0 or below
	 */
	public void add(Employee employee) {

		switch (employee.getRole()) {

		case "manager":
			managerList.add(employee);
			employeeList.add(employee);
			break;

		case "senior":
			seniorList.add(employee);
			employeeList.add(employee);
			break;

		case "junior":
			juniorList.add(employee);
			employeeList.add(employee);
			break;
		}

		if (employee.getParking())
			employeeListWithParking.add(employee);
		else
			employeeListWithNoParking.add(employee);

	}

	/**
	 * Return the list of all employees in the company
	 */
	public void printAllEmployees() {
		System.out.println("\nemployees list: ");
		for (Employee employee : employeeList)
			System.out.println(employee.getName() + " ");
	}

	public void printSeniors() {
		System.out.println("\nsenior employees list: ");
		for (Employee employee : seniorList)
			System.out.println(employee.getName() + " ");

	}

	public void printJuniors() {
		System.out.println("\njunior employees list: ");
		for (Employee employee : juniorList)
			System.out.println(employee.getName() + " ");

	}

	public void printManagers() {
		System.out.println("\nmanagers list: ");
		for (Employee employee : managerList)
			System.out.println(employee.getName() + " ");

	}

	public void printEmployeesWithParking() {
		System.out.println("\nemployees with parking: ");
		for (Employee employee : employeeListWithParking) {
			System.out.println(employee.getName() + " ");
		}
	}

	public void printEmployeesWithNoParking() {

		System.out.println("\nemployees with no parking: ");
		Collections.sort(employeeListWithNoParking, Employee.Seniority);
		for (Employee employee : employeeListWithNoParking)
			System.out.println(employee.getName() + ": seniority " + employee.getYearsInCompany());
	}

}
