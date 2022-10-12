package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectricCarsLocators {

    @FindBy(xpath = "//li[@id=\"faceted-parent-Location\"]")
    public WebElement carLocation;

    @FindBy(xpath = "//input[@id='locationAddress']")
    public WebElement carAddress;

    @FindBy(xpath = "//button[@id='applyLocation']")
    public WebElement locationApply;

    @FindBy(xpath = "//li[@id='faceted-parent-Condition']")
    public WebElement carCondition;

    @FindBy(xpath = "//label[@for=\"rfNew\"]")
    public WebElement carNew;

    @FindBy(xpath = "//label[@for=\"rfDamaged\"]")
    public WebElement carDamaged;

    @FindBy(xpath = "//button[@id='applyCondition']")
    public WebElement conditionApply;

    @FindBy(xpath = "//li[@id='faceted-parent-Type']")
    public WebElement sellerType;

    @FindBy(xpath = "//label[@for=\"rfPrivate\"]")
    public WebElement privateType;

    @FindBy(xpath = "//label[@for='rfOnlineSellerPlus']")
    public WebElement OnlineSellerType;

    @FindBy(xpath = "//button[@id='applySeller']")
    public WebElement typeApply;


}
