package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.AccountPage;

public class AccountPageTest extends BaseTest {
    AccountPage accountPage = new AccountPage(driver);

    @Step("User clicks liked products")
    public void clickLikedProducts() {
        accountPage.clickLikedProducts();
    }
}
