package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class webFlows extends commonOps
{
    @Step("Register nopCommerce Flow")
    public static void registerAndLogout
            (String FirstName, String LastName, String Email, String Password, String ConfirmPassword) throws InterruptedException
    {
        uiActions.click(nopCommerceRegisterAndLogout.btn_registerPage);
        Thread.sleep(3000);
        uiActions.click(nopCommerceRegisterAndLogout.rd_male);
        uiActions.updateText(nopCommerceRegisterAndLogout.txt_firstName, FirstName);
        uiActions.updateText(nopCommerceRegisterAndLogout.txt_lastName, LastName);
        uiActions.updateText(nopCommerceRegisterAndLogout.txt_email, Email);
        uiActions.updateText(nopCommerceRegisterAndLogout.txt_password, Password);
        uiActions.updateText(nopCommerceRegisterAndLogout.txt_confirmPassword, ConfirmPassword);
        uiActions.click(nopCommerceRegisterAndLogout.btn_register);
        Thread.sleep(3000);
        uiActions.click(nopCommerceRegisterAndLogout.btn_logout);
    }

    @Step("Login nopCommerce Flow")
    public static void login(String email, String password) throws InterruptedException
    {
        uiActions.click(nopCommerceLogin.btn_loginPage);
        Thread.sleep(3000);
        uiActions.updateText(nopCommerceLogin.txt_email, email);
        uiActions.updateText(nopCommerceLogin.txt_password, password);
        //uiActions.click(nopCommerceLogin.cb_rememberMe);
        uiActions.click(nopCommerceLogin.btn_login);
    }

    @Step("Add to cart nopCommerce")
    public static void addToCart() throws InterruptedException
    {

        uiActions.mouseHoverElements
                (nopCommerceTopMenu.btn_Computers, nopCommerceComputersMenu.btn_desktop);
        Thread.sleep(3000);
        uiActions.click(nopCommerceDesktopPage.btn_addToCartProductTwo);
        Thread.sleep(3000);
        uiActions.click(nopCommerceDesktopPage.btn_shoppingCart);
        wait.until(ExpectedConditions.visibilityOf(nopCommerceShoppingCart.link_desktopTwo));
    }

    @Step("Remove From cart nopCommerce")
    public static void removeFromCart() throws InterruptedException
    {
        uiActions.click(nopCommerceDesktopPage.btn_shoppingCart);
        Thread.sleep(3000);
        uiActions.click(nopCommerceShoppingCart.rb_remove);
        uiActions.click(nopCommerceShoppingCart.btn_updateShoppingCart);
    }

    @Step("Checkout nopCommerce Flow")
    public static void checkout(String email, String password) throws InterruptedException
    {
        uiActions.click(nopCommerceShoppingCart.rb_termsService);
        uiActions.click(nopCommerceShoppingCart.btn_checkout);
        Thread.sleep(3000);
        uiActions.updateText(nopCommerceLogin.txt_email, email);
        uiActions.updateText(nopCommerceLogin.txt_password, password);
        uiActions.click(nopCommerceLogin.cb_rememberMe);
        uiActions.click(nopCommerceLogin.btn_login);
    }

    @Step ("Building Computer nopCommerce Flow")
    public static void buildComputer() throws InterruptedException
    {
        uiActions.mouseHoverElements
                (nopCommerceTopMenu.btn_Computers, nopCommerceComputersMenu.btn_desktop);
        Thread.sleep(3000);
        uiActions.click(nopCommerceDesktopPage.btn_buildComputer);
        Thread.sleep(3000);
        uiActions.updateDropDown(nopCommerceBuildComputerPage.dd_processor, "2.2 GHz Intel Pentium Dual-Core E2200");
        uiActions.updateDropDown(nopCommerceBuildComputerPage.dd_ram, "8GB [+$60.00]");
        uiActions.click(nopCommerceBuildComputerPage.rb_hdd400);
        uiActions.click(nopCommerceBuildComputerPage.rb_osPremium);
        uiActions.click(nopCommerceBuildComputerPage.cb_swTotalCommander);
    }

}
