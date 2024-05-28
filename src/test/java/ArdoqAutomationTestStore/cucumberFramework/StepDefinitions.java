package ArdoqAutomationTestStore.cucumberFramework;

import ArdoqAutomationTestStore.pageobject.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    BasePage basePage;

    @Given("user is on the Automation Store Website")
    public void userIsOnTheAutomationStoreWebsite() {
        basePage= new BasePage();
    }

    @When("user create an account with required information")
    public void userCreateAnAccountWithRequiredInformation() {
    }

    @Then("account created successfully")
    public void accountCreatedSuccessfully() {
    }
}
