package testingil.cleancode.approvaltests;

import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.approvaltests.Approvals.verify;

@UseReporter({JunitReporter.class})
public class HelloApprovalTest {

    @Disabled
    @Test
    public void hello_approvalTests() {
        String result = "Hello Approval2Tests";
        verify(result);
    }
}
