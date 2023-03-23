package cucumber.screens;

import cucumber.model.User;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PersonelInformationScreen extends BaseScreen{
    public PersonelInformationScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    private final By txtMemberId = By.xpath("//android.view.View[@resource-id='lblMemberId']");

    public void compareUserId(User user) {
        String userIdInPersonalPage = getText(txtMemberId);
        String userIdInUserObject = user.getUserId();
        Assert.assertEquals(userIdInUserObject, userIdInPersonalPage);
    }
}
