package stepDefinitions;

import cucumber.api.java.Before;
import utils.DriverFactory;
import utils.constant.BrowserType;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() {
        setBrowserCapabilities(BrowserType.FIREFOX.getBrowser());
    }
}
