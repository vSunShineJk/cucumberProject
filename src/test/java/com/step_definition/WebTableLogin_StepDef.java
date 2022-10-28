package com.step_definition;

import com.pages.WebTableLoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableLogin_StepDef {
    WebTableLoginPage obj = new WebTableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters user name {string}")
    public void user_enters_user_name(String userName) {
        obj.inputUserName.sendKeys(userName);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        obj.getInputPassword.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        obj.loginButton.click();
    }
    @Then("user should see url contains order")
    public void user_should_see_url_contains_order() {
        Driver.getDriver().getCurrentUrl();
    }
}
