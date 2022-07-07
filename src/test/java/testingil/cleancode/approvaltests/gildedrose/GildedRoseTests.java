package testingil.cleancode.approvaltests.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@UseReporter({DiffReporter.class})
@UseReporter({JunitReporter.class})
public class GildedRoseTests {

	@Disabled
	@Test
	public void gildedRoseApprovalTests() {
		gildedRoseLogger logger = new gildedRoseLogger();
		int days = 31;
		String log  = logger.getLogFor(days);
		Approvals.verify(log);
	}
	
	
}
