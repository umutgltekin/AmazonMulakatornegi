package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPAge {

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By cliclbuyoptions=By.id("buybox-see-all-buying-choices");
    By clickAddCart=By.id("a-autoid-2-offer-1");
    By close =By.cssSelector(".a-icon.a-icon-close.a-icon-medium.aod-close-button");
    By clickCArt=By.id("nav-cart-count");

    public ProductPAge(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 10);
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }
    public void clickBuyOptions(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cliclbuyoptions)).click();

    }
    public void clickAddCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddCart)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(close)).click();
    }
    public void clickCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCArt)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}