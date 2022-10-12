package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.ElectricCarsLocators;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class ElectricCarsActions {

    ElectricCarsLocators electricCarsLocators=null;


    public ElectricCarsActions(){
        this.electricCarsLocators=new ElectricCarsLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10),electricCarsLocators);

    }

    public void setLocation(String postal){
        electricCarsLocators.carLocation.click();
        electricCarsLocators.carAddress.clear();
        electricCarsLocators.carAddress.sendKeys("N2J 2Y2");
       // electricCarsLocators.carAddress.sendKeys(Keys.ENTER);

       electricCarsLocators.locationApply.click();
    }

    public void SetCondition(){
        electricCarsLocators.carCondition.click();
        electricCarsLocators.carNew.click();
        electricCarsLocators.carDamaged.click();
        electricCarsLocators.conditionApply.click();
    }

    public void SetSellerType(){
        electricCarsLocators.sellerType.click();
        electricCarsLocators.OnlineSellerType.click();
        electricCarsLocators.privateType.click();
        electricCarsLocators.typeApply.click();
    }

}
