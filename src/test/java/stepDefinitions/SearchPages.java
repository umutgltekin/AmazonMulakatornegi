package stepDefinitions;

import io.cucumber.java.en.When;
import org.w3c.dom.ranges.DocumentRange;
import pages.SearchPage;
import util.DriverFactory;

public class SearchPages {

    SearchPage searchPage=new SearchPage(DriverFactory.getDriver());

    @When("click brand {string}")
    public void clickBrand(String arg0) {
        searchPage.clickBrand(arg0);

    }

    @When("go to {int}. page")
    public void goToPage(int arg0) {
        searchPage.goToPage(arg0);
        
    }

    @When("click product name {string}")
    public void clickProductName(String arg0) {
        searchPage.clickProductName(arg0);
    }
}
