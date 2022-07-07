package testingil.cleancode.solutions.solidsolution.universities;

import testingil.cleancode.solutions.solidsolution.PackageType;
import testingil.cleancode.solutions.solidsolution.exceptions.NotImplemented;

public class University {
	int ID;

	public int getID() {
		return ID;
	}

	public PackageType getPackageType() {
		throw new NotImplemented();
	}
	private void setID(int ID) {
		throw new NotImplemented();
	}
	private void setName(String name) {
		throw new NotImplemented();
	}
	
	private void setPackageType(PackageType packageType) {
		throw new NotImplemented();
	}

}
