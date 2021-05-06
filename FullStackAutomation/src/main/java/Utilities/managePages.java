package Utilities;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        nopCommerceLogin = PageFactory.initElements(driver, PageObjects.nopCommerce.login.class);
        nopCommerceRegisterAndLogout = PageFactory.initElements(driver, PageObjects.nopCommerce.registerAndLogout.class);
        nopCommerceTopMenu = PageFactory.initElements(driver,PageObjects.nopCommerce.topMenu.class);
        nopCommerceComputersMenu = PageFactory.initElements(driver, PageObjects.nopCommerce.computersMenu.class);
        nopCommerceDesktopPage = PageFactory.initElements(driver, PageObjects.nopCommerce.desktopPage.class);
        nopCommerceShoppingCart = PageFactory.initElements(driver, PageObjects.nopCommerce.shoppingCart.class);
        nopCommerceBuildComputerPage = PageFactory.initElements(driver, PageObjects.nopCommerce.buildComputerPage.class);

        mortgageMain = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
    }
}