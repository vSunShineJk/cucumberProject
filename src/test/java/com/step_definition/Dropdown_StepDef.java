package com.step_definition;

import com.pages.DropdownsPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown_StepDef {

    DropdownsPage obj = new DropdownsPage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

//        Select months = new Select(obj.monthDropdown);
//
//        List<WebElement> actualOptionsAsWebElement = months.getOptions();
//
//        List<String> actualOptionsAsString = new ArrayList<>();
//
//        for (WebElement each : actualOptionsAsWebElement) {
//            actualOptionsAsString.add(each.getText());
//        }

        // This utility method will return us List of String of given dropdown elements
        List<String> actualOptionsAsString = BrowserUtils.dropdownElementsAsString(obj.monthDropdown);

        // Assert will check the size of the list first.
        // If it is matching it will check/verify content 1 by 1.
        Assert.assertEquals("The Assertion is failed!",expectedMonths, actualOptionsAsString);
    }
}
