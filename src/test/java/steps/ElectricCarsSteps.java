package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.actions.ElectricCarsActions;
import pages.actions.HomePageActions;

public class ElectricCarsSteps {

    HomePageActions homePageActions = new HomePageActions();
    ElectricCarsActions electricCarsActions = new ElectricCarsActions();

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        homePageActions.gotoShopElectric();

    }

    @When("set postal code to {string}")
    public void setPostalCodeTo(String arg0) {
    electricCarsActions.setLocation(arg0);
    }

    @And("set Condition to {string} and {string}")
    public void setConditionToAnd(String arg0, String arg1) {
        electricCarsActions.SetCondition();

    }

    @And("set seller type to {string} and {string}")
    public void setSellerTypeToAnd(String arg0, String arg1) {
        electricCarsActions.SetSellerType();
    }

}
