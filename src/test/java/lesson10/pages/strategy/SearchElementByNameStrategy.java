package lesson10.pages.strategy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElementByNameStrategy extends SearchElementStrategy {
    public SearchElementByNameStrategy(WebDriver driver) {
        super(driver);
    }

    public WebElement searchElementByLocator(String locator) {
        return driver.findElement(By.name(locator));
    }
}

