package companyMngSystem;

import java.util.Comparator;

/**
 * In this class the employees are created.
 * 
 * @author Dani Petruneac
 *
 */

public class Employee {

	private String name;
	private int yearsInCompany;
	private String role;
	private boolean parking;

	/**
	 * The employee constructor has the following parameters:
	 * 
	 * @param name
	 *            - a String for the name of the employee
	 * @param yearsInCompany
	 *            - an Integer represents how many years the employee has worked
	 *            in the company
	 * @param role
	 *            - a String for the role the employee has in the company. This
	 *            applications knows only about "manager", "senior" and "junior"
	 * @param parking
	 *            - is a Boolean for the parking lot. "True" means that th
	 *            eemployee has a parking lot, "False" means that the employee
	 *            doesn'thave a parking lot.
	 */

	public Employee(String name, int yearsInCompany, String role, boolean parking) {

		this.name = name;
		this.yearsInCompany = yearsInCompany;
		this.role = role;
		this.parking = parking;
	}

	public String getName() {
		return name;
	}

	public int getYearsInCompany() {
		return yearsInCompany;
	}

	public String getRole() {
		return role;
	}

	public boolean getParking() {
		return parking;
	}

	public static Comparator<Employee> Seniority = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getYearsInCompany() - e2.getYearsInCompany();

		}
	};

	public int compareTo(Employee e) {
		return (this.name).compareTo(e.name);
	}

}
