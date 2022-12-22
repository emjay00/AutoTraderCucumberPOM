package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
    @FindBy(linkText = "Buy Online")
    public WebElement buyOnline;

    @FindBy(linkText = "Sell My Car")
    public WebElement sellCar;

    @FindBy(linkText = "Shop Electric")
    public WebElement shopElectric;


 }
