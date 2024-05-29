package ArdoqAutomationTestStore.cucumberFramework;

import ArdoqAutomationTestStore.pageobject.BasePage;
import ArdoqAutomationTestStore.pageobject.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    BasePage basePage;
    SignUpPage signUpPage;

    @Given("user is on the Automation Store Website")
    public void userIsOnTheAutomationStoreWebsite() {
        basePage= new BasePage();
        signUpPage= new SignUpPage();
    }

    @When("user create an account with required information")
    public void userCreateAnAccountWithRequiredInformation() {
        basePage.moveToAccountLinkAndClickLoginLink();
        basePage.clickContinueButton();
        signUpPage.createAccount();
    }

    @Then("account created successfully")
    public void accountCreatedSuccessfully() {
        signUpPage.verifySuccessfulSignedUp();
    }

    @And("user log out and close the browser")
    public void userLogOut() {
        signUpPage.logOut();
    }
}
