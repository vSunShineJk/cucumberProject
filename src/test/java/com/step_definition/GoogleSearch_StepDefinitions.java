package com.step_definition;

import com.pages.GoogleSearchPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage obj = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @When("user types apple in the google search box and click enter")
    public void user_types_apple_in_the_google_search_box_and_click_enter() {

        obj.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("user sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {

        String expectedTitle = "apple - Поиск в Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("title verification is failed", expectedTitle, actualTitle);

    }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String searchKeyword) {

        obj.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("user sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String expected) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("This is failed",expected,actualTitle);

    }

}
