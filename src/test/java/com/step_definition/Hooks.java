package com.step_definition;

import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //@Before
    public void setUpScenario(){
        System.out.println("Setting up browser using cucumber @Before each Scenario");
    }

    //@Before(value = "@login", order = 2)
    public void setUpFroLogin(){
        // if you want any code to run before ony specific feature/scenario, you can use value="@tagName" to determine this
        System.out.println("Setting up browser using cucumber @Before each @login");
    }

    //@Before(order = 3, value = "db")
    public void setUpDataBaseScenario(){

    }

    @After
    public void tearDownScenario(Scenario scenario){
        // we will implement each taking screenshot in this method
        System.out.println("It will be closing browsing using cucumber @After each scenario");

        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up browser using cucumber @Before each Scenario Step!");
    }
}
