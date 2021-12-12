package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.HomePage;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage(driver);

    @Step("User clicks location button")
    public void clickLocationButton() {
        homePage.clickLocation();
    }

    @Step("User selects province")
    public void selectProvince() {
        homePage.locationProcess();
    }


    @Step("Scroll down for province")
    public void scrollToProvince() {
        String text = "Ankara";

        String uiSelector = "new UiSelector().textMatches(\"" + text
                + "\")";

        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

        driver.findElementByAndroidUIAutomator(command);

    }

    @Step("User selects Istanbul province")
    public void selectIstanbul() {
        homePage.selectTheProvince();
    }

    @Step("User selects town")
    public void selectTown() {
        homePage.selectTheTown();
    }

    @Step("USer selects akyurt town")
    public void selectAkyurt() {
        homePage.selectAkyurt();
    }

    @Step("User selects district")
    public void selectDistrict() {
        homePage.selectDistrict();
    }

    @Step("User selects Ataturk district")
    public void selectTheDistrict() {
        homePage.selectTheDistrict();
    }

    @Step("User clicks save button")
    public void clickSaveButton() {
        homePage.clickSaveButton();
    }


    //case2
    @Step("Scroll down for SuperFiyat")
    public void scrollToSuperFiyat() {
        String text = "Süper Fiyat, Süper Teklif";

        String uiSelector = "new UiSelector().textMatches(\"" + text
                + "\")";

        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

        driver.findElementByAndroidUIAutomator(command);
    }

    @Step("User clicks for super product")
    public void clickSuperProduct() {
        homePage.clickForSuperProduct();
    }

    /*@Step("Scroll for account icon")
    public void existClickByKey() {
        String id = "com.pozitron.hepsiburada:id/account_icon";

        String uiSelector = "new UiSelector().resourceId(\"" + id
                + "\")";

        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

        driver.findElementByAndroidUIAutomator(command);
    }*/

    @Step("User clicks Kesfet button")
    public void clickKesfet() {
        homePage.clickKesfetButton();
    }


    @Step("User clicks account icon")
    public void clickAccountIcon() {
        homePage.clickAccountIcon();
    }
}

