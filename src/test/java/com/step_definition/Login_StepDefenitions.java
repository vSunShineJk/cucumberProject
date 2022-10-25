package com.step_definition;

import com.pages.LibraryLoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefenitions {
    private final LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().navigate().to("https://library1.cydeo.com/login.html");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        libraryLoginPage.emailInput.sendKeys("hr2@gmail.com");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Write code here that turns the phrase above into concrete actions
        libraryLoginPage.passInput.sendKeys("UserUser");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        libraryLoginPage.loginSubmitButton.click();
    }

    @When("user enters student's username")
    public void userEntersStudentSUsername() {
        libraryLoginPage.emailInput.sendKeys("student@gmail.com");
    }

    @And("user enters student's password")
    public void userEntersStudentSPassword() {
        libraryLoginPage.passInput.sendKeys("studentPassword123");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
    }
}
