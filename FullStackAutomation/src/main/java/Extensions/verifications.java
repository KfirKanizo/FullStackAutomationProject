package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;


public class verifications extends commonOps
{
    @Step ("Verify Text in Element")
    public static void textInElement(WebElement elem, String expectedValue)
    {
        if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
        }
        assertEquals(elem.getText(), expectedValue);
    }

    @Step ("Verify the Number of Elements Equals to")
    public static void numberOfElements(List<WebElement> elems, int expectedValue)
    {
        if (!getData("PlatformName").equalsIgnoreCase("Mobile"))
        {
            wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        }
        assertEquals(elems.size(), expectedValue);
    }

    @Step ("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Images are not the same");
    }
}
