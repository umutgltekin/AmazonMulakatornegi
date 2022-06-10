package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import javax.xml.bind.Element;
import java.awt.image.RGBImageFilter;
import java.time.Duration;
import java.util.List;

public class HomePage {
    By checkHomepage = By.id("761gUTMpbC5jkbUhqmwe4Q");
    By refresh=By.id("nav-logo-sprites");
    By search = By.id("twotabsearchtextbox");
    By clicksearch = By.id("nav-search-submit-button");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HomePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 10);
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);


    }
    public void checkHomePage(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(refresh)).click();// driver.findElement(refresh).click();

    }
    public void searchtext(String str){
        driver.findElement(search).sendKeys(str);
    }
    public void clickSearch(){
        driver.findElement(clicksearch).click();

    }

}

