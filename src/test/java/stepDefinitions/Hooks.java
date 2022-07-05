package stepDefinitions;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.time.Duration;


public class Hooks {
    @Before
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}