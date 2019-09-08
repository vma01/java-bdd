package ui.pagesWebElements;

import com.codeborne.selenide.SelenideElement;
import core.Helper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class MainPageWebElements {

    public static SelenideElement pageObjectCard(String textLink) {
        return $(By.xpath("//*[contains(text(), "+ textLink +")]"));
    }
}
