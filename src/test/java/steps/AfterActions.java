package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterActions {
    @After
    public static void tearDown(Scenario scenario) {
       System.out.println(scenario.isFailed());
       //SeleniumDriver.tearDown();

    }
}
