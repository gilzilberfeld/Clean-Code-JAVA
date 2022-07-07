package testingil.cleancode.solutions.solidsolution.students;

import testingil.cleancode.solutions.solidsolution.exceptions.NotImplemented;

public class Student {
	int universityID;
	String emailAddress;

	public Student(String emailAddress, int universityID) {
			this.universityID = universityID;
			this.emailAddress = emailAddress;
	}

	public void setMonthlyEbookAllowance(int allowence) {
	}

	public String getEmailAddress() {
		throw new NotImplemented();
	}
	public int getUniversityID() {
		throw new NotImplemented();
	}
	int getMonthlyEbookAllowance() {
		throw new NotImplemented();
	}
	int getCurrentlyBorrowedEbooks() {
		throw new NotImplemented();
	}
	void setCurrentlyBorrowedEbooks(int books) {
		throw new NotImplemented();
	}

}
