package lesson10.pages.strategy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElementByIdStrategy extends SearchElementStrategy {
    public SearchElementByIdStrategy(WebDriver driver) {
        super(driver);
    }

    public WebElement searchElementByLocator(String locator) {
        return driver.findElement(By.id(locator));
    }

}

