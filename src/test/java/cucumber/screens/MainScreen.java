package cucumber.screens;

import cucumber.model.User;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainScreen extends BaseScreen{
    public MainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);

    }

    private final By btnLoginMain = By.id("com.pordiva.nesine.android:id/btn_login");
    private final By txtUserId = By.id("com.pordiva.nesine.android:id/memberidValue");
    private final By txtMemberNo = By.id("com.pordiva.nesine.android:id/member_no_txt");

    private User user;

    public void memberId() {
        String memberNumber = getText(txtUserId);
        user = new User(memberNumber);
    }

    public User getUser() {
        return user;
    }

    public void clickMainPageLoginButton() {
        waitAndClick(btnLoginMain);
    }


    public void clickMainScreenMemberButton() {
        waitAndClick(txtMemberNo);
    }

    public void verifyLoginButton() {
        verifyElementIsDisplayed(btnLoginMain);
    }


}
