package utils.constant;

public enum BrowserType implements BrowserDriver {
    CHROME("chrome", CHROME_DRIVER, "1920x1080"),
    FIREFOX("firefox", FIREFOX_DRIVER, "1920x1080"),
    IE("ie", IE_DRIVER, "1920x1080");

    private final String browser;
    private final String driver;
    private final String browserSize;

    BrowserType(String browser, String driver, String browserSize) {
        this.browser = browser;
        this.driver = driver;
        this.browserSize = browserSize;
    }

    public String getBrowser() {
        return browser;
    }

    public String getBrowserSize() {
        return browserSize;
    }

    public String getDriver() {
        return driver;
    }
}
