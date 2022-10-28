package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement getInputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

}
