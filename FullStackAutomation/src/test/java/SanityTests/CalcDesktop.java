package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.DesktopFlow;
import WorkFlows.electronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class CalcDesktop extends commonOps
{

    @Test(description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void TC01_CalcAddition() throws InterruptedException
    {
        DesktopFlow.CalculateAddition();
        verifications.textInElement
                (calcMain.field_result, "12");
    }
}