package cucumber.steps;

import cucumber.screens.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseStep {
    protected MainScreen mainScreen;
    protected LoginScreen loginScreen;
    protected AccountScreen accountScreen;
    protected PromotionScreen promotionScreen;
    protected PersonelInformationScreen personelInformationScreen;
    public void setupScreens(AndroidDriver<MobileElement> driver) {
        mainScreen = new MainScreen(driver);
        loginScreen = new LoginScreen(driver);
        accountScreen = new AccountScreen(driver);
        promotionScreen = new PromotionScreen(driver);
        personelInformationScreen = new PersonelInformationScreen(driver);
    }
}
