package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.factory.ProductPage;
import utils.DriverFactory;

public class Products extends DriverFactory {
    private ProductPage productPage;

    @Given("^user navigate to website and click on text \"([^\"]*)\"$")
    public void userNavigateToWebsiteAndClickOnText(String url) {
        productPage = ProductPage.open(url);
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String buttonLocator) {
        productPage.clickOn(buttonLocator);
    }

    @Then("^user should be presented with promo alert$")
    public void userShouldBePresentedWithPromoAlert() {
        productPage.clickProceedButton();
    }
}
