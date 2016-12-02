package siit.java4.student;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import siit.studentRepo.Student;
import siit.studentRepo.StudentRepo;
import siit.studentRepo.ValidationException;

public class StudentRepositiryUnitTests {

	@Test
	public void correctAddOfStudents() throws ValidationException {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Roger", "Federer", 1983, "Male", 1831014));

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));

		assertEquals(list, O.students);
	}

	@Test(expected = ValidationException.class)
	public void addStudentWrongYear() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "Federer", 1883, "Male", 1831014));
	}

	@Test(expected = ValidationException.class)
	public void addStudentNameNotComplete() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "", 1983, "Male", 1831014));
	}

	@Test(expected = ValidationException.class)
	public void addStudentIDNotGood() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "Federer", 1883, "Male", 183101));
	}

	@Test(expected = ValidationException.class)
	public void addStudentGenderNotGood() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "Federer", 1983, "x", 1831014));
	}

	@Test(expected = ValidationException.class)
	public void deleteStudenWrongID() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.deleteStudentByID(1851014);
	}

	@Test(expected = ValidationException.class)
	public void deleteStudentDifferentID() throws ValidationException {

		StudentRepo O = new StudentRepo();
		O.addStudent(new Student("Roger", "Federer", 1983, "Male", 1831014));
		O.addStudent(new Student("Novak", "Djokovici", 1987, "Male", 1871014));

		O.deleteStudentByID(1851014);
	}

}
