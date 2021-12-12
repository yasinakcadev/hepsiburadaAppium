package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import static constant.Utilities.*;

public class MainPage extends BasePage {

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    public void closePopups() {
        clickElement(POPUP_BUTTON);
    }

    public void closeAd() {
        try {
            clickElement(CLOSE_AD);
        }catch (NoSuchElementException e) {
            Log4j.error(e.getMessage());
        }
    }
}
