package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends commonOps
{
    @Step ("Click on Element")
    public static void click (WebElement elem)
    {
        if (!getData("PlatformName").equalsIgnoreCase("Mobile") &&
                (!getData("PlatformName").equalsIgnoreCase("Electron")) &&
                     !getData("PlatformName").equalsIgnoreCase("Desktop"))
        {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        }
        elem.click();
    }

    @Step ("Send Text to Text-Field")
    public static void updateText (WebElement elem , String value)
    {
        if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
        elem.sendKeys(value);
    }

    @Step ("Update DropDown Field")
    public static void updateDropDown (WebElement elem , String value)
    {
        if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step ("Mouse Hover to Element")
    public static void mouseHoverElements (WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

}
