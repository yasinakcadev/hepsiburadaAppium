package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;
import static constant.Utilities.*;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void fillEmail() {
        sendKeys(LOGIN_INPUT,"yasinakcadev@gmail.com");
    }

    public void clickLoginButton() {
        clickElement(LOGIN_BUTTON);
        Log4j.info("email login button clicked");
    }

    public void fillPassword() {
        //Should enter password
        sendKeys(PASSWORD_INPUT,"");
    }

    public void clickPasswordLoginButton() {
        clickElement(PASSWORD_LOGIN_BUTTON);
        Log4j.info("password login button clicked");
    }
}
