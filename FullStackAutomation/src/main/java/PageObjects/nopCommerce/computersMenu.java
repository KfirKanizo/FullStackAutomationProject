package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class computersMenu
{
    @FindBy (css = "a[href='/desktops'")
    public WebElement btn_desktop;

    @FindBy (css = "a[href='/notebooks'")
    public WebElement btn_notebooks;

    @FindBy (css = "a[href='/software'")
    public WebElement btn_software;
}
