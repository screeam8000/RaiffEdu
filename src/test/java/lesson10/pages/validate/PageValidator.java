package lesson10.pages.validate;


import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.WebDriver;

public abstract class PageValidator {
    public boolean isValid(WebDriver driver){
        return !StringUtils.isBlank(driver.getTitle());
    }
}
