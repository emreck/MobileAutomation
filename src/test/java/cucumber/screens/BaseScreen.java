package cucumber.screens;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class BaseScreen {
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 50);
    }

    protected void waitAndClick(By by) { wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click(); }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected void sendText(By by, String text) {

        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(text);
    }

    protected String getText(By by) {

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
        int retries = 0;
        int maxRetries = 5;
        while (text.equals("") && retries < maxRetries) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            retries++;
            text = wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
        }
        return text;

    }
    protected void verifyElementIsDisplayed(By by) {
        MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Assert.assertTrue(element.isDisplayed());
    }
}
