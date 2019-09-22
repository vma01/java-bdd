package ui.factory;

import com.codeborne.selenide.Selenide;
import ui.pagesWebElements.ProductWebElements;

public class ProductPage implements ProductWebElements {
    public static ProductPage open(String url) {
        Selenide.open(url);
        return new ProductPage();
    }

    public void clickOn(String locator) {
        specialOffers(locator).click();
    }

    public void clickProceedButton() {
        proceedButton().click();
    }
}
