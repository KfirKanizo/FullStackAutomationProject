package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class desktopPage
{
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement btn_addToCartProductTwo;

    @FindBy (css = "a[href='/cart'")
    public WebElement btn_shoppingCart;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")
    public WebElement btn_buildComputer;
}
