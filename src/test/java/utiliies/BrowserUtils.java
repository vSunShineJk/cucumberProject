package utiliies;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;


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
}

