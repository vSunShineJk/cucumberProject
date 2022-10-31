package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class=\"button nav__item active\"]")
    public WebElement viewAllOrdersButtonNav;

    @FindBy(css = "a[href='/products'] button")
    public WebElement viewAllProductsButtonNav;

    @FindBy(xpath = "//*[text() = 'Order']")
    public WebElement orderButtonNavItem;

    @FindBy(xpath = "//button[@class=\"button __logout\"]")
    public WebElement logoutButton;

}
