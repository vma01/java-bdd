package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import core.SiteOptions;
import core.SiteUrlPath;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import ui.factory.ContactUsForm;

import java.util.List;

public class ContactUs {
    private ContactUsForm contactUsForm;
    private Faker faker = new Faker();

    @Before
    public void setUpBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Given("^I access webdriverUniversity contact us form$")
    public void iAccessWebdriverUniversityContactUsForm() {
        contactUsForm = ContactUsForm.open(SiteUrlPath.CONTACT_PAGE_URL.getUrl());
    }

    @When("^I enter a valid firstName$")
    public void iEnterAValidFirstName() {
        contactUsForm.setFirstName(faker.address().firstName());
    }

    @And("^I enter a valid lastName$")
    public void iEnterAValidLastName(DataTable dataTable) {
        List<List<String>> contactUsValues = dataTable.raw();
        contactUsForm.setLastName(contactUsValues.get(0).get(0));
    }

    @And("^I enter a valid email address$")
    public void iEnterAValidEmailAddress() {
        contactUsForm.setEmail(faker.internet().emailAddress());
    }

    @And("^I enter comments$")
    public void iEnterComments(DataTable dataTable) {
        List<List<String>> commentValues = dataTable.raw();
        contactUsForm.setComment(commentValues.get(0).get(1));
    }

    @When("^I click on submit button$")
    public void iClickOnSubmitButton() {
        contactUsForm.clickOnSubmitButton();
    }

    @Then("^information should successfully be submitted via contact us form$")
    public void informationShouldSuccessfullyBeSubmittedViaContactUsForm() {
        String message = contactUsForm.verifySuccssesMessage().getText();
        Assert.assertEquals("Invalid message after registration", SiteOptions.SUCCESSFUL_MESSAGE.getSiteOptions(), message);
    }
}
