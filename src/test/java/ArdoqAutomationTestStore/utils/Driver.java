package ArdoqAutomationTestStore.utils;


import org.apache.commons.lang3.SystemUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;
    private Driver(){
    }

    public static WebDriver getDriver(){
        if (driver == null){
            String browser= ConfigReader.readFromConfig("browser").toLowerCase();
            switch (browser){
                case "chrome":
                    driver= new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get(ConfigReader.readFromConfig("url"));
                    break;
                case "edge":
                    driver= new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.get(ConfigReader.readFromConfig("url"));
                    break;
                case "firefox":
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.get(ConfigReader.readFromConfig("url"));
                    break;

                default:
                    throw new RuntimeException("Wrong browser");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!= null){
            driver.quit();
            driver= null;
        }
    }
}
