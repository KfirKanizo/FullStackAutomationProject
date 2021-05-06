package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login
{
    @FindBy (linkText = "Log in")
    public WebElement btn_loginPage;

    @FindBy (id = "Email")
    public WebElement txt_email;

    @FindBy (id = "Password")
    public WebElement txt_password;

    @FindBy (id = "RememberMe")
    public WebElement cb_rememberMe;

    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public WebElement btn_login;

    @FindBy (css = "a[class='ico-account'")
    public WebElement btn_myAccount;
}
