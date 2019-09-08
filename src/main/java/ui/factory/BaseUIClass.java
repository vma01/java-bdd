package ui.factory;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseUIClass {

    @BeforeClass
    public void setUpBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "http://www.webdriveruniversity.com";
    }
}
