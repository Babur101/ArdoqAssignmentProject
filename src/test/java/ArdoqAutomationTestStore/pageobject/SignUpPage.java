package ArdoqAutomationTestStore.pageobject;


import ArdoqAutomationTestStore.utils.Driver;
import ArdoqAutomationTestStore.utils.UiUtil;
import ArdoqAutomationTestStore.utils.XpathUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    UiUtil uiUtil;
    XpathUtil xpathUtil;
    Actions actions;

    public RegistrationPage() {
        Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
        actions=new Actions(Driver.getDriver());
        uiUtil= new UiUtil(Driver.getDriver());
        xpathUtil=new XpathUtil();
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
    }
}
