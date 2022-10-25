package com.step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before
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
    public void tearDownScenario(){
        // we will implement each taking screenshot in this method
        System.out.println("It will be closing browsing using cucumber @After each scenario");
    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up browser using cucumber @Before each Scenario Step!");
    }
}
