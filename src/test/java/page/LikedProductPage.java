package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static constant.Utilities.*;

public class LikedProductPage extends BasePage {

    public LikedProductPage(AndroidDriver driver) {
        super(driver);
    }

    public String getLikedProductTitle() {
        return getText(PRODUCT_COUNT);
    }

    public void isProductLiked() {
        Assert.assertTrue("Product has not been added",isVisible(By.xpath("//*[@text='Seç']")));
    }

}

