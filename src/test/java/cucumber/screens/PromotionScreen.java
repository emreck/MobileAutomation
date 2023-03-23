package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Random;

public class PromotionScreen extends BaseScreen{
    public PromotionScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    private String generatedCode;

    private final By btnPromotionBack = By.id("com.pordiva.nesine.android:id/back");
    private final By txtPromotionCode = By.xpath("//android.widget.EditText[@resource-id='code']");

    public String generateRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
    public void fillRandomPromotionCode() {
        generatedCode = generateRandomNumber(10);
        sendText(txtPromotionCode, generatedCode);
    }

    public void controlPromotionCode() {

        Assert.assertEquals(generatedCode,getText(txtPromotionCode));
    }


    public void clickCloseButton() {
        waitAndClick(btnPromotionBack);
    }
}
