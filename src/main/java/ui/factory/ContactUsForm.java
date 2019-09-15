package ui.factory;

import com.codeborne.selenide.Selenide;
import ui.pagesWebElements.ContactUsWebElements;

public class ContactUsForm implements ContactUsWebElements {

    public static ContactUsForm open(String url) {
        Selenide.open(url);
        return new ContactUsForm();
    }

    public void setFirstName(String firstName) {
        firstNameInput().setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameInput().setValue(lastName);
    }

    public void setEmail(String email) {
        emailInput().setValue(email);
    }

    public void setComment(String comment) {
        commentInput().setValue(comment);
    }

    public void clickOnSubmitButton() {
        submitButton().click();
    }
}
