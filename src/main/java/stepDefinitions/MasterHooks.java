package stepDefinitions;

import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() {
        setBrowserCapabilities();
    }
}
