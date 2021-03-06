package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.mobileFlows;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (Utilities.listeners.class)
public class mortgageMobile extends commonOps
{
    @Test(description = "Test01: Verify Mortgage")
    @Description("Test Description: Fill in Mortgage fields and calculate Repayment")
    public void TC01_VerifyRepayment() throws InterruptedException
    {
        mobileFlows.calculate("1000", "3", "4");
        verifications.textInElement
                (mortgageMain.txt_Repayment, "£30.03");
        verifications.textInElement
                (mortgageMain.txt_InterestOnly, "£3.33");
    }
}
