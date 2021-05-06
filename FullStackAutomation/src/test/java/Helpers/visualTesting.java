package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
    @Test
    public void createScreenShot () throws InterruptedException
    {
        webFlows.addToCart();
        helperMethods.takeElementScreenShot(nopCommerceShoppingCart.img_desktopTwoInCart, "desktop 2 in Shopping Cart_v1.0");
    }
}
