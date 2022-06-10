package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePages {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    @Given("see home Page")
    public void seeHomePage() {
        homePage.checkHomePage();
    }

    @When("search {string}")
    public void search(String arg0) {
        homePage.searchtext(arg0);
        
    }

    @When("click search button")
    public void clickSearchButton() {
        homePage.clickSearch();
    }
}