package stepDefinitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPO;
import pages.HomePage;

public class US_0001_global {

    HomePage homePage = new HomePage();
    CommonPO commonPO = new CommonPO();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User clicks the T_shirts button")
    public void user_clicks_the_Tshirts_button() {
        Utils.waitFor(1);
        homePage.t_shirtsBtn.click();
        Utils.waitFor(1);
    }

    @When("User selects the {string} and the {string}")
    public void user_selects_the_and_the(String size, String color) {
        Utils.getSize(size);
        Utils.getColour(color);
    }

    @When("User hovers over and adds the {string} to the cart")
    public void user_hovers_over_and_adds_the_to_the_cart(String productName) {
        Utils.hoverProductsByText(commonPO.productToAdd, productName);
        commonPO.addToCartBtn.click();
    }

    @When("User closes the opening window")
    public void user_closes_the_opening_window() {
        Utils.waitForClickablility(commonPO.closeBtn,10);
        commonPO.closeBtn.click();
    }

    @When("User hovers over the Dresses button and clicks the Evening Dresses button")
    public void user_hovers_over_the_dresses_button_and_clicks_the_evening_dresses_button() {
        Utils.hover(homePage.dressesBtn);
        Utils.waitForClickablility(homePage.eveningDressBtn,4);
        homePage.eveningDressBtn.click();
    }

    @When("User hovers over the Dresses button and clicks the Summer Dresses button")
    public void user_hovers_over_the_dresses_button_and_clicks_the_summer_dresses_button() {
        Utils.hover(homePage.dressesBtn);
        homePage.summerDressBtn.click();
    }

    @When("User clicks the cart to checkout")
    public void user_clicks_the_cart_to_checkout() {
        Utils.waitForClickablility(commonPO.shoppingCartBtn,5);
        commonPO.shoppingCartBtn.click();
    }

    @When("User removes the {string} from the cart")
    public void user_removes_the_from_the_cart(String productName) {
        Utils.removeProduct(productName);
        Utils.waitFor(2);
    }

    @When("User adds a second the same {string}")
    public void user_adds_a_second_the_same(String productName) {
        Utils.addProduct(productName);
        Utils.waitFor(2);
    }

    @Then("Assert the each line in cart")
    public void assert_the_each_line_in_cart() {
        Assert.assertTrue("Total cost of the line is not correct", Utils.verifyEachLineTotalPrice());
    }

    @Then("Assert the cart total is {string}")
    public void assert_the_cart_total_is(String totalPrice) {
        Assert.assertEquals("total price does not match", totalPrice,commonPO.totalPriceContainer.getText());
    }
}
