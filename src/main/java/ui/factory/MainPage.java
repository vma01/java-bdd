package ui.factory;

import com.codeborne.selenide.Selenide;
import core.Helper;
import ui.pagesWebElements.MainPageWebElements;

public class MainPage extends MainPageWebElements {
    public static MainPage open() {
        Selenide.open(Helper.SITE_BASE_PATH);
        return new MainPage();
    }

    public ProductPage clickProductCard(String textLink) {
        pageObjectCard(textLink).click();
        return new ProductPage();
    }
}
