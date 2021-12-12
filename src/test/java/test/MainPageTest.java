package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.MainPage;

public class MainPageTest extends BaseTest {
    MainPage mainPage = new MainPage(driver);

    @Step("Close the popup on the main page")
    public void closePopupOnMainPage() {
        mainPage.closePopups();
    }

    @Step("Close the ad on main page")
    public void closeAd() {
        mainPage.closeAd();
    }
}
