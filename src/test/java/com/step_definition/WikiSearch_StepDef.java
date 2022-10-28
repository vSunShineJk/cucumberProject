package com.step_definition;

import com.pages.WikiSearchPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {

    WikiSearchPage obj = new WikiSearchPage();
    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
//    @When("user types Steve Jobs in the wiki search box")
//    public void user_types_steve_jobs_in_the_wiki_search_box() {
//        obj.searchBox.sendKeys("Steve Jobs");
//    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        obj.searchButton.click();
    }
//    @Then("user sees Steve Jobs in the wiki title")
//    public void user_sees_steve_jobs_in_the_wiki_title() {
//        Assert.assertTrue("Test is failed!",Driver.getDriver().getTitle().contains("Викепедия"));
//    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        obj.searchBox.sendKeys(string);
    }
    @Then("user sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}