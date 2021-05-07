package PageObjects.ElectronDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage
{
    @FindBy (id = "button-app-sys-information")
    public WebElement btn_systemInfo;

    @FindBy (id = "app-version-demo-toggle")
    public WebElement btn_versionInfo;

    @FindBy (xpath = "//*[@id=\"version-info\"]")
    public WebElement btn_viewDemo;

    @FindBy (xpath = "//*[@id=\"got-version-info\"]")
    public WebElement txt_appVersion;
}
