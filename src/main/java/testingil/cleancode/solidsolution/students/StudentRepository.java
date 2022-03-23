package testingil.cleancode.solidsolution.students;

import testingil.cleancode.solidsolution.exceptions.NotImplemented;

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
