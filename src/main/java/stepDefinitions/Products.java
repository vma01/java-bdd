package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Products {
    @Given("^user navigate to \"([^\"]*)\" website$")
    public void userNavigateToWebsite(String url) {
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String button) {
    }

    @Then("^user should be presented with promo alert$")
    public void userShouldBePresentedWithPromoAlert() {
    }
}
