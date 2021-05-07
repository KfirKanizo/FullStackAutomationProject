package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class electronFlows extends commonOps
{
    @Step("Get Application Version")
            public static void getAppVersion()
    {
        uiActions.click(electronMain.btn_systemInfo);
        uiActions.click(electronMain.btn_versionInfo);
        uiActions.click(electronMain.btn_versionInfo);
        uiActions.click(electronMain.btn_viewDemo);
    }


}
