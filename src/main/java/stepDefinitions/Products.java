package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.factory.BaseUIClass;
import ui.factory.MainPage;

public class Products extends BaseUIClass {
    @Given("^user navigate to website and click on text \"([^\"]*)\"$")
    public void userNavigateToWebsiteAndClickOnText(String textLink) {
        MainPage.open()
                .clickProductCard(textLink);
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String button) {
    }

    @Then("^user should be presented with promo alert$")
    public void userShouldBePresentedWithPromoAlert() {
    }
}
