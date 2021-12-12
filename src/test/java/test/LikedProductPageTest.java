package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import page.LikedProductPage;

public class LikedProductPageTest extends BaseTest {
    LikedProductPage likedProductPage = new LikedProductPage(driver);

    @Step("Check product added into liked products")
    public void compareProductTitle() {
        //Assert.assertEquals("Count are not same",likedProductPage.getLikedProductTitle(),"1 ürün");
        likedProductPage.isProductLiked();
    }
}
