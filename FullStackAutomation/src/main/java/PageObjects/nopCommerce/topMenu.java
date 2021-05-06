package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topMenu
{
    @FindBy (xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]")
    public WebElement btn_Computers;
}
