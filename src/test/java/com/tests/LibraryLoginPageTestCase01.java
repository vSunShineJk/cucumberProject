package com.tests;

import com.pages.LibraryLoginPage;
import com.utilities.Driver;
import org.junit.Test;

public class LibraryLoginPageTestCase01 {
    @Test
    public void test1() {
        Driver.getDriver().navigate().to("https://library1.cydeo.com/login.html");

        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.emailInput.sendKeys("hr2@cydeo.com");
        libraryLoginPage.passInput.sendKeys("UserUser");
        libraryLoginPage.loginSubmitButton.click();
    }
}
