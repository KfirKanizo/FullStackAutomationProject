package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class nopCommerceWeb extends commonOps
{
   @Test (description = "Test01: Register to nopCommerce")
   @Description ("Test Description: Register to nopCommerce and then Logout")
    public void TC01_RegisterAndLogout() throws InterruptedException
        {
            webFlows.registerAndLogout
        (getCredentials("Others"), getCredentials("Others"), getCredentials("email"), getCredentials("Others"), getCredentials("Others"));
            Thread.sleep(3000);
            verifications.textInElement(nopCommerceLogin.btn_loginPage, "Log in");
        }

    @Test (description = "Test02: Login to nopCommerce")
    @Description ("Test Description: Login to nopCommerce Web Application")
    public void TC02_login() throws InterruptedException
    {
        webFlows.login
        (getCredentials("email"), getCredentials("Others"));
        verifications.textInElement
                (nopCommerceLogin.btn_myAccount,"My account");
    }

    @Test (description = "Test03: Add to Cart in nopCommerce")
    @Description ("Test Description: Add item to Cart in nopCommerce Web Application")
    public void TC03_addToCart() throws InterruptedException
    {
        webFlows.addToCart();
        verifications.textInElement
                (nopCommerceShoppingCart.link_desktopTwo, "Digital Storm VANQUISH 3 Custom Performance PC");
    }


    @Test (description = "Test04: Build your own computer in nopCommerce")
    @Description ("Test Description: Build your own computer in nopCommerce Web Application")
    public void TC04_BuildComputer() throws InterruptedException
    {
        webFlows.buildComputer();
        verifications.textInElement
                (nopCommerceBuildComputerPage.txt_price, "$1,460.00");
    }
}
