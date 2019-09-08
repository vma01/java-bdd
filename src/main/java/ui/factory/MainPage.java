package ui.factory;

import com.codeborne.selenide.Selenide;
import ui.pagesWebElements.MainPageWebElements;

public class MainPage extends MainPageWebElements {
    public static MainPage open() {
        Selenide.open("/");
        return new MainPage();
    }

    public ProductPage clickProductCard(String textLink) {
        pageObjectCard(textLink).click();
        return new ProductPage();
    }
}
