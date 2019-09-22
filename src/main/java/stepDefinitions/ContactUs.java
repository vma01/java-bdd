package stepDefinitions;

import com.github.javafaker.Faker;
import org.testng.Assert;
import utils.DriverFactory;
import utils.constant.SiteOption;
import utils.constant.SiteUrlPath;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.factory.ContactUsForm;

import java.util.List;

public class ContactUs extends DriverFactory {
    private ContactUsForm contactUsForm;
    private Faker faker = new Faker();

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
        Assert.assertEquals("Invalid message after registration", SiteOption.SUCCESSFUL_MESSAGE.getSiteOption(), message);
    }
}
