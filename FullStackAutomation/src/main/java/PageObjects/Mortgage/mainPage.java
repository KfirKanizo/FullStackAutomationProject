package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage
{
    @FindBy (id = "etAmount")
    public WebElement txt_Amount;

    @FindBy (id = "etTerm")
    public WebElement txt_Term;

    @FindBy (id = "etRate")
    public WebElement txt_Rate;

    @FindBy (id = "TextView01")
    public WebElement btn_Calculate;

    @FindBy (id = "tvRepayment")
    public WebElement txt_Repayment;

    @FindBy (id = "tvInterestOnly")
    public WebElement txt_InterestOnly;
}
