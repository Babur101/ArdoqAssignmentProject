package ArdoqAutomationTestStore.steps;

import ArdoqAutomationTestStore.pageobject.SignUpPage;
import ArdoqAutomationTestStore.utils.ConfigReader;
import ArdoqAutomationTestStore.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;




public class Hooks {
    @Before
    public void setUp(){
        String URL= ConfigReader.readFromConfig("url");
        Driver.getDriver().get(URL);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
