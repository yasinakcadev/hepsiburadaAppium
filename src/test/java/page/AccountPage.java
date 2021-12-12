package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static constant.Utilities.*;

public class AccountPage extends BasePage {

    public AccountPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickLikedProducts() {
        try {
            clickElement(LIKED_PRODUCTS);
            Log4j.info("Clicked liked products");
        }catch (NoSuchElementException e) {
            Log4j.error(e.getMessage());
        }
    }
}