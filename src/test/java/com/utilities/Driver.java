package com.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;
public class Driver {
    private static WebDriver webDriver;
    private Driver() {}

    public static WebDriver getDriver() {
        if (webDriver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    webDriver = new SafariDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    webDriver = new OperaDriver();
                    break;
                case "explorer":
                    WebDriverManager.iedriver().setup();
                    webDriver = new InternetExplorerDriver();
                    break;
                default:
                    throw new IllegalArgumentException("unknown browser type - " + browser);
            }
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        return webDriver;
    }

    public static void closeDriver() {
        if (webDriver != null)
            webDriver.quit(); // this will kill the session but driver will not be null
    }
}


