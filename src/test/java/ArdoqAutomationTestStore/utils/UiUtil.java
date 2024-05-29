package ArdoqAutomationTestStore.utils;

import net.datafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;


public class UiUtil {
    Actions actions;
    Faker faker= null;
    WebDriver driver;


    public UiUtil(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
        faker= new Faker();
        actions= new Actions(driver);
    }

    public WebElement getElement(String locator){
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public void moveToElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }

    public void moveToWebLinkAndClick(WebElement element, WebElement element2){
        actions.moveToElement(element).build().perform();
        element2.click();
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

    public void getText(WebElement element){
        element.getText();
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String generateFakeFirstName(){
        return faker.name().firstName();
    }

    public String generateFakeLastName(){
        return faker.name().lastName();
    }

    public String generateFakeEmail(){
        return faker.internet().emailAddress();
    }

    public String generateFakeCityName(){
        return faker.address().cityName();
    }

    public String generateFakeZipCode(){
        return faker.address().zipCode();
    }

    public String generateFakeAddress(){
        return  faker.address().streetAddress();
    }

    public void selectDropDownByText(WebElement element, String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectDropDownByIndex(WebElement element, int index){
        Select select= new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByValue(WebElement element, String value){
        Select select= new Select(element);
        select.selectByValue(value);
    }

    public void selectRandomDropdown(WebElement element){
        Select dropdown= new Select(element);
        int numOptions= dropdown.getOptions().size();
        Random random= new Random();
        int randomIndex= random.nextInt(numOptions-1)+1;
        selectDropDownByIndex(element,randomIndex);
    }

    public void scrollWithJS(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void takeScreenShot(String fileName, WebDriver driver){
        DateTime dateTime= new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yy-MM-dd-HH-mm");
        String timeStamp= dateTime.toString(formatter);
        fileName= fileName+ "_"+timeStamp;
        File imageFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String imageFolder= "screenshots";
        try {
            FileUtils.copyFile(imageFile,new File(imageFolder+File.separator+fileName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
