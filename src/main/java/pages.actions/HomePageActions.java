package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

    HomePageLocators homepageLocators = null;

    public HomePageActions() {
        this.homepageLocators = new HomePageLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10),homepageLocators);
    }

    public void gotoShopElectric() {
        homepageLocators.shopElectric.click();
    }

    public void gotoBuyOnline() {
        homepageLocators.buyOnline.click();
    }

    public void gotoSellMyCar() {
        homepageLocators.sellCar.click();
    }




}
