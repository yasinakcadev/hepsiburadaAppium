package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Step("User fills email field")
    public void fillEmailField() {
        loginPage.fillEmail();
    }

    @Step("User clicks login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step("User fills password field")
    public void fillPasswordField() {
        loginPage.fillPassword();
    }

    @Step("User clicks password login button")
    public void clickPasswordLoginButton() {
        loginPage.clickPasswordLoginButton();
    }
}

