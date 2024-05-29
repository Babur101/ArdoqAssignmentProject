package ArdoqAutomationTestStore.utils;

import org.openqa.selenium.WebElement;

public class XpathUtil {

    //HomePage
    public static final String accountLink= "//*[text()='Account']";
    public static final String loginLink= "//span[text()='Login']";
    public static final String continueButtonHomePage= "//*[@title='Continue']";

    //Register Account Page
    public static final String firstNameField= "//*[@id='AccountFrm_firstname']";
    public static final String lastNameField= "//*[@id='AccountFrm_lastname']";
    public static final String emailField= "//*[@id='AccountFrm_email']";
    public static final String addressField= "//*[@id='AccountFrm_address_1']";
    public static final String cityField= "//*[@id='AccountFrm_city']";
    public static final String regionField= "//*[@id='AccountFrm_zone_id']";
    public static final String zipCodeField= "//*[@id='AccountFrm_postcode']";
    public static final String countryField= "//*[@id='AccountFrm_country_id']";
    public static final String loginNameField= "//*[@id='AccountFrm_loginname']";
    public static final String passwordField= "//*[@id='AccountFrm_password']";
    public static final String passwordConfirmField= "//*[@id='AccountFrm_confirm']";
    public static final String subscribeOptionNo= "//*[@id='AccountFrm_newsletter0']";
    public static final String policyClickBox= "//*[@id='AccountFrm_agree']";
    public static final String continueButtonSignUpPage= "//*[@class='fa fa-check']";

    //User DashboardPage
    public static final String myAccountTextForConfirmation= "//*[text()=' Your Account Has Been Created!']";
    public static final String manageAddressBookVerification= "//*[@class='dash-tile dash-tile-ocean clearfix']";
    public static final String continueButtonDashboardPage= "//*[@class='btn btn-default mr10']";
    public static final String logOffLink= "//*[@id='maincontainer']/div/div[2]/div[1]/div/ul/li[10]/a";
}
