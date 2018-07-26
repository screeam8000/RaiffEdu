package lesson10.pages.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class SearchElementStrategy {
    protected WebDriver driver;

    public SearchElementStrategy(WebDriver driver) {
        this.driver = driver;
    }

    public abstract WebElement searchElementByLocator(String locator);
}
