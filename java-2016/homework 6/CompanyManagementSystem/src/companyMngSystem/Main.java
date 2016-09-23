package companyMngSystem;

/**
 * This is the main class of the project.
 * 
 * @author Dani Petruneac
 *
 */
public class Main {

	public static void main(String[] args) {

		SystemManagement employeeList = new SystemManagement();

		employeeList.add(new Employee("Jack", 7, "manager", true));
		employeeList.add(new Employee("Mike", 4, "junior", false));
		employeeList.add(new Employee("Michelle", 6, "junior", true));
		employeeList.add(new Employee("Mark", 8, "manager", false));
		employeeList.add(new Employee("Adam", 5, "senior", true));
		employeeList.add(new Employee("Paul", 3, "senior", true));
		employeeList.add(new Employee("George", 8, "senior", false));
		employeeList.add(new Employee("Pete", 2, "junior", true));
		employeeList.add(new Employee("Tim", 9, "senior", false));
		employeeList.add(new Employee("David", 4, "junior", false));

		employeeList.printAllEmployees();
		employeeList.printSeniors();
		employeeList.printJuniors();
		employeeList.printManagers();
		employeeList.printEmployeesWithParking();
		employeeList.printEmployeesWithNoParking();

	}

}
