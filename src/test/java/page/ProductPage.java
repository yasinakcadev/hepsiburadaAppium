package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class ProductPage extends BasePage {

    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return getText(PRODUCT_NAME);
    }

    public void clickProductImage() {
        clickElement(PRODUCT_IMAGE);
        Log4j.info("clicked product image");
    }

    public void closePicture() {
        clickElement(CLOSE_IMAGE_BUTTON);
        Log4j.info("image closed");
    }

    public void addProductToFavorite() {
        clickElement(FAVORITE_BUTTON);
        Log4j.info("favorite button clicked");
    }

    public void clickWelcomeButton() {
        clickElement(WELCOME_BUTTON);
        Log4j.info("welcome popup clicked");
    }

}
