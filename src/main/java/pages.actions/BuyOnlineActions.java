package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.BuyOnlineLocators;
import utils.SeleniumDriver;

public class BuyOnlineActions {

    BuyOnlineLocators buyOnlineLocators=null;

    public BuyOnlineActions(){
        this.buyOnlineLocators=new BuyOnlineLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10),buyOnlineLocators);

    }

    public void selectMake(String carBrand) {
        Select selectCarMaker = new Select(buyOnlineLocators.anyMake);
        selectCarMaker.selectByVisibleText(carBrand);
    }

    public void selectModel(String carModel) {
        Select selectCarModel = new Select(buyOnlineLocators.anyModel);
        selectCarModel.selectByVisibleText(carModel);
    }


    public void selectLocation(String carLocation) {
        buyOnlineLocators.locationPostal.clear();
        buyOnlineLocators.locationPostal.sendKeys(carLocation);
    }

    public void clickSearch() {
        buyOnlineLocators.searchButton.click();
    }
}
