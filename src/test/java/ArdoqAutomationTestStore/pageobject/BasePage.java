package ArdoqAutomationTestStore.pageobject;

import ArdoqAutomationTestStore.utils.Driver;
import ArdoqAutomationTestStore.utils.UiUtil;
import ArdoqAutomationTestStore.utils.XpathUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    UiUtil uiUtil;
    Actions actions;

    public BasePage (){
        Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
        actions=new Actions(Driver.getDriver());
        uiUtil= new UiUtil(Driver.getDriver());
    }

    public void moveToAccountLinkAndClickLoginLink(){
        WebElement element= uiUtil.getElement(XpathUtil.accountLink);
        WebElement element2= uiUtil.getElement(XpathUtil.loginLink);
        uiUtil.moveToWebLinkAndClick(element,element2);
    }

    public void clickContinueButton(){
        WebElement element= uiUtil.getElement(XpathUtil.continueButtonHomePage);
        uiUtil.clickElement(element);
    }

}
