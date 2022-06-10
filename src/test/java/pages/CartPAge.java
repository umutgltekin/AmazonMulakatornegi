package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.List;

public class CartPAge {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By checkcart= By.cssSelector(".a-row.sc-action-links");
    By removaproduct=By.cssSelector(".a-color-link");
    By checkCartEmpty=By.cssSelector(".a-spacing-mini.a-spacing-top-base");
    public CartPAge(WebDriver driver){
        this.wait=new WebDriverWait(driver,10);
        this.driver=driver;
        this.elementHelper=new ElementHelper(driver);
    }
    public void checkcart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkcart));
    }
    public void removeProduct(){
        driver.findElement(removaproduct).click();

    }
    public void checkCartEmpty(){
        boolean check=false;
        String text=wait.until(ExpectedConditions.visibilityOfElementLocated(checkCartEmpty)).getText();
        if(text.contains("Your Amazon Cart is empty.")){
            check=true;
        }
        Assert.assertEquals(true,check);

    }
}
