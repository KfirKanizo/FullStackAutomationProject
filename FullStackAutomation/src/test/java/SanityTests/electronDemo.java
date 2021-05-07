package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.electronFlows;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class electronDemo extends commonOps
{

    @Test(description = "Test01: Verify Application Version")
    @Description("Test Description: Getting the app version and verify it")
    public void TC01_getAppVersion() throws InterruptedException
    {
        electronFlows.getAppVersion();
                verifications.textInElement
                (electronMain.txt_appVersion, "This app is using Electron version: 1.6.2");
    }
}
