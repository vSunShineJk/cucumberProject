package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input#inputEmail")
    public WebElement emailInput;

    @FindBy (css = "input#inputPassword")
    public WebElement passInput;

    @FindBy (xpath = "//button")
    public WebElement loginSubmitButton;
}
