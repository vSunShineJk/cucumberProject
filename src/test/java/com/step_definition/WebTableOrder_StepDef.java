package com.step_definition;

import com.pages.BasePage;
import com.pages.ViewAllOrders;
import com.pages.WebTableLoginPage;
import com.pages.WebTableOrderPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDef {

    WebTableLoginPage objLogPg = new WebTableLoginPage();
    BasePage objBsPg = new BasePage();
    WebTableOrderPage objOrPg = new WebTableOrderPage();
    ViewAllOrders objVeAlOr = new ViewAllOrders();
    Select select;
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        objLogPg.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        objOrPg.orderPageButton.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        select = new Select(objOrPg.productTypeDropdown);
        select.selectByVisibleText(string);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        // default there was a number in this input
        // first we need to clean that input, and we will send keys later
        //objOrPg.inputQuantity.clear();
        objOrPg.inputQuantity.sendKeys(Keys.BACK_SPACE);

        // accepting int arg and sending text using sendKeys() method
        // since sendKeys() method accepts only String, we need to either concat with ""
        // or send String.valueOf(int)
        // objOrPg.inputQuantity.sendKeys(String.valueOf(int));

        objOrPg.inputQuantity.sendKeys(int1+"");

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        objOrPg.inputName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        objOrPg.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        objOrPg.inputCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        objOrPg.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        objOrPg.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//        for (WebElement each : objOrPg.cardType) {
//            if (each.getAttribute("value").equalsIgnoreCase(string)) each.click();
//        }
        BrowserUtils.clickRadioButton(objOrPg.cardType,string);
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        objOrPg.inputCardNo.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        objOrPg.inputCardExp.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        objOrPg.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {
        String actualCustomerName = objVeAlOr.newCustomerSell.getText();
        Assert.assertEquals(expectedCustomerName,actualCustomerName);
    }
}
