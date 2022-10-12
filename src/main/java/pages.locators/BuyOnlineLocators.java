package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyOnlineLocators {
    @FindBy(xpath = "//select[@id='rfMakes']")
    public WebElement anyMake;

    @FindBy(xpath = "//select[@id='rfModel']")
    public WebElement anyModel;

    @FindBy(xpath = "(//input[@id='locationAddress'])[1]")
    public WebElement locationPostal;

    @FindBy(xpath = "(//a[@id='SearchButton'])[1]")
    public WebElement searchButton;

}
