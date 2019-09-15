package ui.factory;

import com.codeborne.selenide.Selenide;
import ui.pagesWebElements.MainPageWebElements;

public class MainPage extends MainPageWebElements {
    public static MainPage open(String url) {
        Selenide.open(url);
        return new MainPage();
    }
}
