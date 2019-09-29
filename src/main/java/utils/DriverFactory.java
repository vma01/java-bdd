package utils;

import com.codeborne.selenide.Configuration;
import utils.constant.BrowserType;

import java.util.Map;

public class DriverFactory {
    public void setBrowserCapabilities() {
        LoadProperties loadProperties = new LoadProperties();
        Map<String, String> browserProperties = loadProperties.loadPropertiesFile("browser.properties");
        String browserType = browserProperties.get("browser.name");

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
