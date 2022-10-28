package com.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {
    // Methods are static, because we do not want to create objects to call those methods.
    // We just want ot call those methods with class name. That is why there are static type

    /**
     * This method is used to pose the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */


    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }

    // Method 4
    // name: verifyTitle()
    // return type: void
    // arg1: WebDriver
    // arg2: StringExpectedTitle
    // colling the method: browserUtils.verifyTitle(driver,"Google")

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method will accept dropdown as a WebElement
     * and return all the options' text in a list of String
     * @return List<String></String>
     */
    public static List<String> dropdownElementsAsString(WebElement dropdown){

        Select months = new Select(dropdown);

        // List of all ACTUAL months <options> as a WebElement
        List<WebElement> actualOptionsAsWebElement = months.getOptions();

        // List of all ACTUAL months <options> as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        // with using for loop we are converting each WebElement of options to String with using getText() method
        // with using add() method we will add each String to List
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;
    }
}

