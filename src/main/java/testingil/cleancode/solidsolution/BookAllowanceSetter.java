package testingil.cleancode.solidsolution;

import java.util.HashMap;

import testingil.cleancode.solidsolution.students.Student;
import testingil.cleancode.solidsolution.rules.IAllowanceRule;
import testingil.cleancode.solidsolution.rules.PremiumAllowanceRule;
import testingil.cleancode.solidsolution.rules.StandardAllowanceRule;

public class BookAllowanceSetter {
	Student student;
	HashMap<PackageType, IAllowanceRule> rules;
	
	public BookAllowanceSetter(Student student) {
		this.student = student;
		
		rules = new HashMap<PackageType, IAllowanceRule>() {
			{
				put(PackageType.Premium, new PremiumAllowanceRule());
				put(PackageType.Standard, new StandardAllowanceRule());
			}
		};
	}
	
	public void setAllowance(PackageType type) {
		int factor = rules.get(type).getFactor();
		student.setMonthlyEbookAllowance(factor * 10);
	}
	
}
