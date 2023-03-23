package cucumber.steps;

import cucumber.model.User;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.utilities.ThreadLocalDriver;

public class Step extends BaseStep {
    @Before
    public void setupScreen() {
        setupScreens(ThreadLocalDriver.getTLDriver());
    }

    @Given("I will Click Login Button In Main Screen")
    public void clickMainLoginButton() {
        mainScreen.clickMainPageLoginButton();
    }


    @When("I will Fills Username As {string} Password As {string}")
    public void fillsUsernameAndPassword(String username,String password) {
        loginScreen.fillUsernameAndPassword(username,password);
    }

    @And("I will Click Login Button In Login Screen")
    public void clickLoginButtonInLoginScreen() {
        loginScreen.clickLoginButton();
    }


    @When("I will Click Member Number")
    public void clickMemberNo() {
        mainScreen.clickMainScreenMemberButton();
    }

    @When("I will Click Logout Button")
    public void clickLogout() {
        accountScreen.clickLogoutButton();
    }

    @When("I will Click Continue Logout Popup")
    public void continueLogoutPopup() {
        accountScreen.clickbCountinuePopupButton();
    }

    @Then("I should see Login Button")
    public void verifyLoginButton() {
        mainScreen.verifyLoginButton();
    }

    @When("I will Click promotion Button")
    public void clickPromotionButton() {
        accountScreen.clickPromotionButton();
    }

    @When("I will Fill random promotion code")
    public void fillRandomPromotionCode() {
        promotionScreen.fillRandomPromotionCode();
    }

    @And("I will Check random promotion code")
    public void checkRandomPromotionCode() {
        promotionScreen.controlPromotionCode();
    }

    @When("I will Click promotion Screen Close Button")
    public void clickPromotionScreenCloseButton() {
        promotionScreen.clickCloseButton();
    }

    @Then("I will should see Account Page")
    public void checkAccountPage() {
        accountScreen.verifyAccountPage();
    }

    @When("I will Click Personel Information Button")
    public void clickPersonelInformationButton() {
        accountScreen.clickPersonelInformationButton();
    }

    @When("I will Get member number In Home Screen")
    public void getMemberNumberInHomeScreen() {
        mainScreen.memberId();
    }

    @Then("I will Check User Id Match")
    public void userIdMatchControl() {
        User user = mainScreen.getUser();
        personelInformationScreen.compareUserId(user);

    }

    @Then("I should See Information Popup Text")
    public void seeInformationPopup() {
        loginScreen.InformationPopupTextControl();
    }

    @When("I will Click Popup Button")
    public void popupClickButton() {
        loginScreen.clickPopupButton();
    }

    @Then("I should see Login Button In Login Page")
    public void seeLoginButton() {
        loginScreen.LoginButtonVerify();
    }

}
