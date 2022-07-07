package testingil.cleancode.solutions.solidsolution.students;

import testingil.cleancode.solutions.solidsolution.exceptions.NotImplemented;

public class StudentRepository {
		public void add(Student student) {
			throw new NotImplemented();
		}
		public boolean exists(String emailAddress) {
			throw new NotImplemented();
		}
	
		public Student createStudent(String emailAddress, int universityID) {
			return new Student(emailAddress, universityID);
		}

}
