import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IntegrationTest {
	@Test
	public void getListWithCorrectArgumentList() {
		//given
		ManagementSystem ms = new ManagementSystem();
		ms.addEmployee(new Employee("Matthew",3,"dev",true));
		ms.addEmployee(new Employee("George",1,"tester",false));
		ms.addEmployee(new Employee("Adam",5,"admin",false));
		ms.addEmployee(new Employee("Will",3,"dev",true));
		ms.addEmployee(new Employee("Chris",8,"manager",true));
		
		//when
		List<Employee> employeeNoParkingSpace = new ArrayList<>();
		employeeNoParkingSpace = ms.getList();
		
		//then
		List<Employee> expectedList = new ArrayList<Employee>();
		expectedList.add(new Employee("George",1,"tester",false));
		expectedList.add(new Employee("Adam",5,"admin",false));
		
		assertTrue(employeeNoParkingSpace.equals(expectedList));
		
	}
	
}
