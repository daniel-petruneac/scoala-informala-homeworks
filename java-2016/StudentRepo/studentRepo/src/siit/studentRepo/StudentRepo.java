package siit.studentRepo;

import java.util.ArrayList;
import java.util.Calendar;

public class StudentRepo {

	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<Student> toBeRemoved = new ArrayList<Student>();

	public void addStudent(Student s) throws ValidationException {

		int length = (int) (Math.log10(s.getID()) + 1);
		int year = Calendar.getInstance().get(Calendar.YEAR);

		if ((s.getDateOfBirth() < 1900) || (s.getDateOfBirth() > year - 18)) {
			throw new ValidationException("bad year");
		}
		if ((s.getFirstName() == null) || (s.getLastName() == null) || (s.getLastName() == "")
				|| (s.getFirstName() == "")) {
			throw new ValidationException("enter full name");
		}
		if (length != 7) {
			throw new ValidationException("bad ID");
		}
		if ((s.getGender().equalsIgnoreCase("M")) || (s.getGender().equalsIgnoreCase("F"))) {
			students.add(s);
		} else {
			throw new ValidationException("Gender is not good");
		}
	}

	public void deleteStudentByID(int ID) throws ValidationException {

		boolean checker = false;

		if (ID == 0) {
			throw new ValidationException("bad ID");
		} else {
			for (Student s : students) {
				if (s.getID() == ID) {
					toBeRemoved.add(s);
					System.out.println("The student " + s.getID() + " was removed.");
					checker = true;
				}
			}
			if (checker == false) {
				throw new ValidationException("Student with this ID does not exist");
			}
		}
	}

	public void searchStudents(int age) throws ValidationException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		if (age < 0) {
			throw new ValidationException("Age should be positive.");
		} else {
			for (Student s : students) {
				if (year - s.getDateOfBirth() == age) {
					System.out.println(s.getFirstName() + " " + s.getLastName() + " is " + age + " old.");
				}
			}
		}
	}

	public void printAllStudents() throws ValidationException {
		if (students.isEmpty()) {
			throw new ValidationException("List is empty");
		} else {
			for (Student s : students) {
				System.out.println(s.getFirstName() + " " + s.getLastName());
			}
		}
	}
}
