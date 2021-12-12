package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public AndroidDriver driver;
    public WebDriverWait wait;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void clickElement(By by) {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(by)).click();
        }catch (NoSuchElementException e) {
            Log4j.error(e.getMessage());
        }
    }

    public String getText(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by)).getText();
    }

    public boolean isVisible(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by)).isDisplayed();
    }

    public void sendKeys(By by, CharSequence text) {
        try {
            WebElement element = findElement(by);
            wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
        }catch (NoSuchElementException e) {
            Log4j.error(e.getMessage());
        }
    }
}
