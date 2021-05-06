package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCart
{
    @FindBy (css = "a[class='product-name']")
    public WebElement link_desktopTwo;

    @FindBy (id = "termsofservice")
    public WebElement rb_termsService;

    @FindBy (id = "checkout")
    public WebElement btn_checkout;

    @FindBy (id = "removefromcart11221")
    public WebElement rb_remove;

    @FindBy (xpath = "//input[@name='updatecart']")
    public WebElement btn_updateShoppingCart;

    @FindBy (xpath = "//input[@name='continueshopping']")
    public WebElement btn_continueShopping;

    @FindBy (xpath = "//div[@class='no-data']")
    public WebElement emptyCart;

    @FindBy (css = "img[src=\"https://demo.nopcommerce.com/images/thumbs/0000022_digital-storm-vanquish-3-custom-performance-pc_80.jpeg\"")
    public WebElement img_desktopTwoInCart;
}
