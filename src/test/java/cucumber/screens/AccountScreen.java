package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AccountScreen extends BaseScreen{
    public AccountScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    private final By btnPersonalInfo = By.id("com.pordiva.nesine.android:id/personal_info_btn");
    private final By btnPromotion = By.id("com.pordiva.nesine.android:id/my_promotions_btn");
    private final By btnLogout = By.id("com.pordiva.nesine.android:id/logout_btn");
    private final By btnCountinuePopup = By.id("android:id/button1");

    public void clickLogoutButton() {
        waitAndClick(btnLogout);
        }
    public void clickbCountinuePopupButton() {
        waitAndClick(btnCountinuePopup);
    }
    public void clickPromotionButton() {
        waitAndClick(btnPromotion);
    }
    public void verifyAccountPage() {
        verifyElementIsDisplayed(btnPromotion);
    }

    public void clickPersonelInformationButton() {
        waitAndClick(btnPersonalInfo);
    }
}
