package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerAndLogout
{
    @FindBy (css = "a[class='ico-register'")
    public WebElement btn_registerPage;

    @FindBy (id = "gender-male")
    public WebElement rd_male;

    @FindBy (id = "FirstName")
    public WebElement txt_firstName;

    @FindBy (id = "LastName")
    public WebElement txt_lastName;

    @FindBy (css = "select[name='DateOfBirthDay'")
    public WebElement dd_day;

    @FindBy (css = "select[name='DateOfBirthMonth'")
    public WebElement dd_month;

    @FindBy (css = "select[name='DateOfBirthYear'")
    public WebElement dd_year;

    @FindBy (id = "Email")
    public WebElement txt_email;

    @FindBy (id = "Password")
    public WebElement txt_password;

    @FindBy (id = "ConfirmPassword")
    public WebElement txt_confirmPassword;

    @FindBy (id = "register-button")
    public WebElement btn_register;

    @FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public WebElement btn_logout;
}
