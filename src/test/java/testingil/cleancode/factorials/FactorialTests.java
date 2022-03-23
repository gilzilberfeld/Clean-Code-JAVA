package testingil.cleancode.factorials;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@UseReporter({DiffReporter.class})
@UseReporter({JunitReporter.class})
public class FactorialTests {

	@Test
	public void factorials() {
		assertEquals(1, Factorial.calculate(1));
		assertEquals(2, Factorial.calculate(2));
		assertEquals(6, Factorial.calculate(3));
		assertEquals(3628800, Factorial.calculate(10));
	}

    @Disabled
	@Test
	public void factorialApprovalTests() {
		
        StringBuilder sb = new StringBuilder();
        sb.append("1 -> " + Factorial.calculate(1) + "\n");
        sb.append("2 -> " + Factorial.calculate(2)+ "\n");
        sb.append("3 -> " + Factorial.calculate(3)+ "\n");
        sb.append("10 -> " + Factorial.calculate(10)+ "\n");
        
        Approvals.verify(sb.toString());
    }
}     
