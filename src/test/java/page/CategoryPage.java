package page;

import base.BasePage;
import base.Log4j;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class CategoryPage extends BasePage {
    public CategoryPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickCategoryTab() {
        clickElement(CATEGORY_TAB);
        Log4j.info("clicked category tab");
    }

    public void clickPopularCategory() {
        clickElement(POPULAR_CATEGORY);
        Log4j.info("clicked popular category");
    }

    public void clickMenWear() {
        clickElement(MEN_WEAR);
        Log4j.info("clicked men wears");
    }

    public String checkProvinceTitle() {
        String title = getText(PROVINCE_TITLE);
        return title;
    }

}