package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginScreen extends BaseScreen{
    public LoginScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    private final By txtUsername = By.id("com.pordiva.nesine.android:id/username_edit");
    private final By txtPassword = By.id("com.pordiva.nesine.android:id/password_edit");
    private final By btnLogin = By.id("com.pordiva.nesine.android:id/login_btn");
    private final By txtErrorMessage = By.id("android:id/message");
    private final By btnErrorOk = By.id("android:id/button2");


    public void clickLoginButton() {

        click(btnLogin);

    }

    public void fillUsernameAndPassword(String username,String password) {

        sendText(txtUsername, username);
        sendText(txtPassword, password);

    }

    public void InformationPopupTextControl() {
        String errorMessage = getText(txtErrorMessage);
        Assert.assertEquals(errorMessage,"Üye numaranız, TC kimlik numaranız veya şifreniz hatalıdır! Lütfen bilgilerinizi kontrol ediniz.");
    }

    public void clickPopupButton() {
        click(btnErrorOk);
    }

    public void LoginButtonVerify() {
        verifyElementIsDisplayed(btnLogin);
    }
}
