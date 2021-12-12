package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import page.CategoryPage;

public class CategoryPageTest extends BaseTest {
    CategoryPage categoryPage = new CategoryPage(driver);

    @Step("User clicks category tab")
    public void clickCategory() {
        categoryPage.clickCategoryTab();
    }

    @Step("User clicks popular category")
    public void clickPopularCategory() {
        categoryPage.clickPopularCategory();
    }

    @Step("User clicks men wears")
    public void clickMenWears() {
        categoryPage.clickMenWear();
    }

    @Step("User checks province title")
    public void checkTitle() {
        Assert.assertEquals(categoryPage.checkProvinceTitle(),"Ankara");
    }
}

