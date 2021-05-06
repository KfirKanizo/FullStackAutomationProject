package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.awt.image.BufferedImage;

public class base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();


    public static PageObjects.nopCommerce.registerAndLogout nopCommerceRegisterAndLogout;
    public static PageObjects.nopCommerce.login nopCommerceLogin;
    public static PageObjects.nopCommerce.topMenu nopCommerceTopMenu;
    public static PageObjects.nopCommerce.computersMenu nopCommerceComputersMenu;
    public static PageObjects.nopCommerce.desktopPage nopCommerceDesktopPage;
    public static PageObjects.nopCommerce.shoppingCart nopCommerceShoppingCart;
    public static PageObjects.nopCommerce.buildComputerPage nopCommerceBuildComputerPage;


    public static PageObjects.Mortgage.mainPage mortgageMain;
}