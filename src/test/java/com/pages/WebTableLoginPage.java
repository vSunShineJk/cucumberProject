package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage extends BasePage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement getInputPassword;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    /**
     * This method will accept username and password and login to app
     * @param username
     * @param password
     */

    public void login(String username, String password){
        inputUserName.sendKeys(username);
        getInputPassword.sendKeys(password);
        loginButton.click();
    }

}
