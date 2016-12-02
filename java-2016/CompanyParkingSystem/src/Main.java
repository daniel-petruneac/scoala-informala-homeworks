import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ManagementSystem ms = new ManagementSystem();
		ms.addEmployee(new Employee("Mark",2,"dev",false));
		ms.addEmployee(new Employee("Joel",1,"dev",true));
		ms.addEmployee(new Employee("Chris",6,"tester",true));
		ms.addEmployee(new Employee("Maya",6,"manager",false));
		ms.addEmployee(new Employee("Phill",9,"manager",true));
		ms.addEmployee(new Employee("Bill",11,"tester",false));
		ms.addEmployee(new Employee("Anne",8,"admin",false));
		
		List<Employee> noParkingSpaceList = new ArrayList<>();
		noParkingSpaceList = ms.getList();
		System.out.println(noParkingSpaceList);
			
	}
}	
