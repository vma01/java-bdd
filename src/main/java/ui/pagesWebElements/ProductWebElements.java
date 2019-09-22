package ui.pagesWebElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface ProductWebElements {
    default SelenideElement specialOffers(String locator) {
        return $(By.id(""+ locator +""));
    }

    default SelenideElement proceedButton() {
        return $(By.xpath("//button[text()='Proceed']"));
    }
}
