package ui.pagesWebElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface ContactUsWebElements {

    default SelenideElement firstNameInput() {
        return $(By.cssSelector("input[name='first_name']"));
    }

    default SelenideElement lastNameInput() {
        return $(By.cssSelector("input[name='last_name']"));
    }

    default SelenideElement emailInput() {
        return $(By.cssSelector("input[name='email']"));
    }

    default SelenideElement commentInput() {
        return $(By.cssSelector("textarea[name='message']"));
    }

    default SelenideElement submitButton() {
        return $(By.xpath("//input[@value='SUBMIT']"));
    }

    default SelenideElement verifySuccssesMessage() {
        return $(By.xpath(".//*[@id='contact_reply']/h1"));
    }
}
