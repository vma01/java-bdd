package ui.pagesWebElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class ProductWebElements {

    SelenideElement productCard(String selector) {
        return $(By.className(selector));
    }
}
