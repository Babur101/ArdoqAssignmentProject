package ArdoqAutomationTestStore.pageobject;


import ArdoqAutomationTestStore.utils.Driver;
import ArdoqAutomationTestStore.utils.UiUtil;
import ArdoqAutomationTestStore.utils.XpathUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    UiUtil uiUtil;
    Actions actions;

    public SignUpPage() {
        Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
        actions=new Actions(Driver.getDriver());
        uiUtil= new UiUtil(Driver.getDriver());

    }

    public void createAccount(){
        WebElement element1= uiUtil.getElement(XpathUtil.firstNameField);
        WebElement element2= uiUtil.getElement(XpathUtil.lastNameField);
        WebElement element3= uiUtil.getElement(XpathUtil.emailField);
        WebElement element4= uiUtil.getElement(XpathUtil.addressField);
        WebElement element5= uiUtil.getElement(XpathUtil.cityField);
        WebElement element6= uiUtil.getElement(XpathUtil.regionField);
        WebElement element7= uiUtil.getElement(XpathUtil.zipCodeField);
        WebElement element8= uiUtil.getElement(XpathUtil.countryField);
        WebElement element9= uiUtil.getElement(XpathUtil.loginNameField);
        WebElement element10= uiUtil.getElement(XpathUtil.passwordField);
        WebElement element11= uiUtil.getElement(XpathUtil.passwordConfirmField);
        WebElement element12= uiUtil.getElement(XpathUtil.subscribeOptionNo);
        WebElement element13= uiUtil.getElement(XpathUtil.policyClickBox);
        WebElement element14= uiUtil.getElement(XpathUtil.continueButtonSignUpPage);



        uiUtil.waitForElementPresent(element1);
        uiUtil.clickElement(element1);
        uiUtil.sendKeys(element1, uiUtil.generateFakeFirstName());
        uiUtil.clickElement(element2);
        uiUtil.sendKeys(element2, uiUtil.generateFakeLastName());
        uiUtil.clickElement(element3);
        uiUtil.sendKeys(element3, uiUtil.generateFakeEmail());
        uiUtil.clickElement(element4);
        uiUtil.sendKeys(element4, uiUtil.generateFakeAddress());

        uiUtil.scrollWithJS(uiUtil.getElement(XpathUtil.continueButtonHomePage));
        uiUtil.waitForElementPresent(uiUtil.getElement(XpathUtil.continueButtonSignUpPage));

        uiUtil.clickElement(element5);
        uiUtil.sendKeys(element5, uiUtil.generateFakeCityName());
        uiUtil.selectRandomDropdown(element8);
        uiUtil.clickElement(element7);
        uiUtil.sendKeys(element7, uiUtil.generateFakeZipCode());
        uiUtil.selectRandomDropdown(element6);
        uiUtil.clickElement(element9);
        uiUtil.sendKeys(element9, uiUtil.generateFakeFirstName()+uiUtil.generateFakeLastName());
        uiUtil.clickElement(element10);
        uiUtil.sendKeys(element10,"12345678");
        uiUtil.clickElement(element11);
        uiUtil.sendKeys(element11,"12345678");
        uiUtil.clickElement(element12);
        uiUtil.clickElement(element13);
        uiUtil.clickElement(element14);
    }

    public void verifySuccessfulSignedUp(){
        WebElement element15= uiUtil.getElement(XpathUtil.continueButtonDashboardPage);

        uiUtil.waitForElementPresent(uiUtil.getElement(XpathUtil.myAccountTextForConfirmation));
        Assert.assertTrue(uiUtil.getElement(XpathUtil.myAccountTextForConfirmation).isDisplayed());
        uiUtil.clickElement(element15);
        uiUtil.waitForElementPresent(uiUtil.getElement(XpathUtil.manageAddressBookVerification));
        Assert.assertTrue(uiUtil.getElement(XpathUtil.manageAddressBookVerification).isDisplayed());
        uiUtil.takeScreenShot("verifyUserCreatedSuccessfully",Driver.getDriver());
    }

    public void logOut(){
        WebElement element16= uiUtil.getElement(XpathUtil.logOffLink);

        uiUtil.waitForElementPresent(element16);
        uiUtil.clickElement(element16);
        Driver.getDriver().close();
        Driver.getDriver().quit();

    }
}
