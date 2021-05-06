package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class buildComputerPage
{
    @FindBy (xpath = "//*[@id=\"product_attribute_1\"]")
    public WebElement dd_processor;

    @FindBy (css = "select[name=\"product_attribute_2\"]")
    public WebElement dd_ram;

    @FindBy (css = "input[id=\"product_attribute_3_7\"]")
    public WebElement rb_hdd400;

    @FindBy (css = "input[id=\"product_attribute_4_9\"]")
    public WebElement rb_osPremium;

    @FindBy (css = "input[id=\"product_attribute_5_12\"]")
    public WebElement cb_swTotalCommander;

    @FindBy (css = "input[id=add-to-cart-button-1]")
    public WebElement btn_addToCart;

    @FindBy (css = "span[id=price-value-1]")
    public WebElement txt_price;

}
