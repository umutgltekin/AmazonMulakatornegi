package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class SearchPage {
    By clickBrand= By.id(".a-spacing-micro");
    By goToPqge=By.cssSelector(".s-pagination-item.s-pagination-button");
    By clickProductName=By.cssSelector(".a-size-medium.a-color-base.a-text-normal");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public SearchPage(WebDriver driver){
        this.wait=new WebDriverWait(driver,10);
        this.driver=driver;
        this.elementHelper=new ElementHelper(driver);
    }
    public void clickBrand(String str){
        List<WebElement> elements=driver.findElements(By.cssSelector(".a-size-base.a-color-base.s-bold-weight-text"));
        for (WebElement element:elements) {
            if(element.getText().contains("Brand")){
                List<WebElement> elem= element.findElements(By.xpath("../..//*[@class='a-size-base a-color-base']"));
                for (WebElement element1:elem) {
                        if(element1.getText().equals(str)) {
                            wait.until(ExpectedConditions.visibilityOf(element1)).click();
                            break;
                        }
                }
                break;
            }
        }
    }
    public void goToPage(int a){
        int b=Integer.parseInt( driver.findElement(goToPqge).getText());
        System.out.println("çıkan değer "+b);
       if (b==a){
           driver.findElement(goToPqge).click();

       }
    }

    public void clickProductName(String a){
        List<WebElement>elements=driver.findElements(clickProductName);
        for (WebElement element:elements) {
            if(element.getText().equals(a)){
                element.click();
                break;
            }

        }

    }
}
