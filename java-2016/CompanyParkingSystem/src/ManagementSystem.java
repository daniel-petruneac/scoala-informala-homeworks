import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagementSystem {
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Employee> noParkingList = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		employees.add(employee);

	}

	public List<Employee> getList() {
		createList();
		if (noParkingList.isEmpty()) {
			throw new IllegalArgumentException("You must add employee before you get the list");
		}
		Collections.sort(noParkingList, new Comparator<Employee>() {
			@Override
			public int compare(Employee employee1, Employee employee2) {
				if (employee1.getSeniority() > employee2.getSeniority()) {
					return 1;
				} else if (employee1.getSeniority() < employee2.getSeniority()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return noParkingList;
	}

	private void createList() {
		for (int i = 0; i < employees.size(); i++)
			if (!employees.get(i).isHasParkingSpace())
				noParkingList.add(employees.get(i));

	}

}
