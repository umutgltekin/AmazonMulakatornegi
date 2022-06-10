package stepDefinitions;

import io.cucumber.java.en.When;
import pages.CartPAge;
import util.DriverFactory;

public class CartPages {
   CartPAge cartPAge= new CartPAge(DriverFactory.getDriver());

    @When("check cart")
    public void checkCart() {
     cartPAge.checkcart();
    }

    @When("remove product")
    public void removeProduct() {
     cartPAge.removeProduct();
    }

    @When("check cart empty")
    public void checkCartEmpty() {
     cartPAge.checkCartEmpty();
    }
}
