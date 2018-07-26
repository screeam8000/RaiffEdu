package lesson10.pages.validate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageValidator extends PageValidator {
    @Override
    public boolean isValid(WebDriver driver) {
        WebElement nothingElement =
                driver.findElement(By.cssSelector("div.card-section > p"));
        boolean isValid = nothingElement == null
                && super.isValid(driver);
        return isValid;
    }
}

