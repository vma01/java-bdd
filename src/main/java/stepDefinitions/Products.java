package stepDefinitions;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.factory.MainPage;

public class Products {
    @Before
    public void setUpBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Given("^user navigate to website and click on text \"([^\"]*)\"$")
    public void userNavigateToWebsiteAndClickOnText(String textLink) {
//        MainPage.open()
//                .clickProductCard(textLink);
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String button) {
    }

    @Then("^user should be presented with promo alert$")
    public void userShouldBePresentedWithPromoAlert() {
    }
}
