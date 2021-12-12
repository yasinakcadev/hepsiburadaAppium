package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void clickLocation() {
        clickElement(LOCATION_BUTTON);
        Log4j.info("Clicked location button");
    }

    public void locationProcess() {
        clickElement(SELECT_PROVINCE);
        Log4j.info("clicked select province");
    }

    public void selectTheProvince() {
        clickElement(ANKARA_PROVINCE);
        Log4j.info("province selected");
    }

    public void selectTheTown() {
        clickElement(SELECT_TOWN);
        Log4j.info("clicked select town");
    }

    public void selectAkyurt() {
        clickElement(AKYURT_TOWN);
        Log4j.info("town selected");
    }

    public void selectDistrict() {
        clickElement(SELECT_DISTIRICT);
        Log4j.info("clicked select distirict");
    }

    public void selectTheDistrict() {
        clickElement(ATATURK_DISTIRICT);
        Log4j.info("district selected");
    }

    public void clickSaveButton() {
        clickElement(SAVE_BUTTON);
        Log4j.info("save button clicked");
    }

    //case2

    public void clickForSuperProduct() {
        clickElement(SUPER_PRODUCT);
        Log4j.info("super product clicked");
    }

    public void clickKesfetButton() {
        clickElement(KESFET_BUTTON);
        Log4j.info("kest button clicked");
    }

    public void clickAccountIcon() {
        clickElement(ACCOUNT_ICON);
        Log4j.info("account icon clicked");
    }

}