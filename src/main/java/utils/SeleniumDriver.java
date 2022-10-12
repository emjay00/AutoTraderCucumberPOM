package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //init driver
    private static WebDriver driver;
    //init time for browser to wait -- explicit wait
    private static WebDriverWait wait;

    public final static int timeout = 30;
    //init page load timeout
    public final static int page_timeout = 40;

    //private constructor -- initialise when called
    private SeleniumDriver() {
        //setting chrome options
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--start-maximized");
        chrome_options.addArguments("--incognito");

        driver = new ChromeDriver(chrome_options);
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(page_timeout, TimeUnit.SECONDS);
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (seleniumDriver == null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown() {
        if(driver!=null){
            driver.close();
            driver.quit();
        }
        seleniumDriver=null;

    }
}

