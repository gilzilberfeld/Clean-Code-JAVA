package testingil.cleancode.solidsolution.universities;

import testingil.cleancode.solidsolution.PackageType;
import testingil.cleancode.solidsolution.exceptions.NotImplemented;

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
