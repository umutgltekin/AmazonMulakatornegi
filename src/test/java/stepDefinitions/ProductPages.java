package stepDefinitions;

import com.mongodb.DBRef;
import io.cucumber.java.en.When;
import pages.ProductPAge;
import util.DriverFactory;

public class ProductPages {
    ProductPAge productPAge=new ProductPAge(DriverFactory.getDriver());
    @When("click buy options")
    public void clickBuyOptions() {
        productPAge.clickBuyOptions();
    }

    @When("click add cart")
    public void clickAddCart() {
        productPAge.clickAddCart();
        
    }

    @When("go to cart")
    public void goToCart() {
        productPAge.clickCart();
    }
}
