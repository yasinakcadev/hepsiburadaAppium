package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import page.ProductPage;

import static java.time.Duration.ofMillis;

public class ProductPageTest extends BaseTest {
    ProductPage productPage = new ProductPage(driver);

    @Step("User clicks product image")
    public void clickProductImage() {
        productPage.clickProductImage();
    }

    @Step("<yön> yönüne swipe et")
    public void swipe(String yon) {

        Dimension d = driver.manage().window().getSize();
        int height = d.height;
        int width = d.width;

        if (yon.equals("SAĞ")) {

            int swipeStartWidth = (width * 80) / 100;
            int swipeEndWidth = (width * 30) / 100;

            int swipeStartHeight = height / 2;
            int swipeEndHeight = height / 2;

            //appiumDriver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);
            new TouchAction(driver)
                    .press(PointOption.point(swipeStartWidth, swipeStartHeight))
                    .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
                    .moveTo(PointOption.point(swipeEndWidth, swipeEndHeight))
                    .release()
                    .perform();
        } else if (yon.equals("SOL")) {

            int swipeStartWidth = (width * 30) / 100;
            int swipeEndWidth = (width * 80) / 100;

            int swipeStartHeight = height / 2;
            int swipeEndHeight = height / 2;

            //appiumDriver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

            new TouchAction(driver)
                    .press(PointOption.point(swipeStartWidth, swipeStartHeight))
                    .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
                    .moveTo(PointOption.point(swipeEndWidth, swipeEndHeight))
                    .release()
                    .perform();

        }
    }

    @Step("User clicks the close image button")
    public void clickCloseImage() {
        productPage.closePicture();
    }

    @Step("User adds product to favorite")
    public void addFavorite() {
        productPage.addProductToFavorite();
    }

    @Step("User clicks welcome button")
    public void clickWelcomeButton() {
        productPage.clickWelcomeButton();
    }
}

