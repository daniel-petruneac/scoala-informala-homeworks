package siit.studentRepo;

import java.io.IOException;

public class Main {

	public static void main(String args[]) throws SecurityException, IOException {
		try {
			StudentRepo sr = new StudentRepo();
			sr.addStudent(new Student("Avram", "Vasiliu", 1986, "m", 2365987));
			sr.addStudent(new Student("Mihai", "Duduman", 1992, "m", 5236547));
			sr.addStudent(new Student("Mircea", "Ionescu", 1976, "M", 1247853));
			sr.addStudent(new Student("Ioana", "Croitoru", 1992, "f", 1223411));
			sr.addStudent(new Student("Cristian", "Popescu", 1989, "m", 1023658));
			sr.addStudent(new Student("Mirela", "Cozma", 1989, "f", 7586321));

			sr.deleteStudentByID(2365987);
			sr.searchStudents(27);
			System.out.println("----------------");
			sr.printAllStudents();
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
