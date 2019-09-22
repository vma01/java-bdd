package utils.constant;

public interface BrowserDriver {
    String BASE_PATH = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\driver\\";
    String CHROME_DRIVER = BASE_PATH + "chromedriver.exe";
    String FIREFOX_DRIVER = BASE_PATH + "chromedriver.exe";
    String IE_DRIVER = BASE_PATH + "chromedriver.exe";
}
