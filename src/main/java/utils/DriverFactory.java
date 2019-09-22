package utils;

import com.codeborne.selenide.Configuration;
import utils.constant.BrowserType;

public class DriverFactory {
    public void setBrowserCapabilities(String browserType) {

        if (BrowserType.CHROME.getDriver().equalsIgnoreCase(browserType)) {
            System.setProperty("webdriver.chrome.driver", BrowserType.CHROME.getDriver());
            System.setProperty("selenide.browser", BrowserType.CHROME.getBrowser());
            Configuration.browserSize = BrowserType.CHROME.getBrowserSize();
        }

        if (BrowserType.FIREFOX.getDriver().equalsIgnoreCase(browserType)) {
            System.setProperty("webdriver.firefox.driver", BrowserType.FIREFOX.getDriver());
            System.setProperty("selenide.browser", BrowserType.FIREFOX.getBrowser());
            Configuration.browserSize = BrowserType.FIREFOX.getBrowserSize();
        }
    }
}
