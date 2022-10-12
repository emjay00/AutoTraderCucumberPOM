package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.BuyOnlineActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    HomePageActions homePageActions = new HomePageActions();
    BuyOnlineActions buyOnlineActions = new BuyOnlineActions();

    @Given("I am on the home page {string} of Autotrader website")
    public void i_am_on_the_home_page_of_autotrader_website(String string) {
        SeleniumDriver.openPage(string);
    }

    @When("I click on menu")
    public void i_click_on_menu(List<String> list) {
        String menu = list.get(1);
        homePageActions.gotoBuyOnline();

    }

    @When("select make as {string} from Make dropdown")
    public void select_make_as_from_make_dropdown(String string) {
        buyOnlineActions.selectMake("Jeep");
    }
//    @When("select model as {string} from Model dropdown")
//    public void select_model_as_from_model_dropdown(String string) {
//        buyOnlineActions.selectModel("Grand Cherokee");
//    }

    @When("set location as {string}")
    public void set_location_as(String string) {
        buyOnlineActions.selectLocation("N2J 2Y2");
    }

    @When("click search button")
    public void click_search_button() {
        buyOnlineActions.clickSearch();
    }

    @Then("I should see list of cars that fit the parameter")
    public void i_should_see_list_of_cars_that_fit_the_parameter() {
        System.out.println("Car list found");
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String string) {
        String title = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(title, string);
    }
}
