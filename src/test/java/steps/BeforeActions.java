package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
    @Before
    public static void setUp(){
        SeleniumDriver.setUpDriver();
    }
}
