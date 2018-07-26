package lesson10.pages;

import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchPage extends SearchPage {

    @FindBy(id = "lst-ib")
    private WebElement googleSearchInput;

    @Override
    public void search(String query) {
        googleSearchInput.sendKeys("Ramin Djawadi");
        googleSearchInput.sendKeys(Keys.RETURN);
    }

    public boolean isSearchResultAvailable() {
        assertEquals("Ramin Djawadi - Поиск в Google", driver.getTitle());

        //WebDriverWait waiter= new WebDriverWait(driver, 10);
        //WebElement longWaitResults =
                //waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("rso")));

        WebElement divResults = driver.findElement(By.id("rso"));
        if(divResults == null){
            return false;
        }

        List<WebElement> divResultList = driver.findElements(By.className("bkWMgd"));
        if(divResultList.size() <= 0){
            return false;
        }

        List<WebElement> devResultListInner =
                driver.findElements(By.cssSelector("div.bkWMgd > div.srg"));
        if(devResultListInner.size() <= 0){
            return false;
        }


        WebElement counterElem =
                driver.findElement(By.xpath("//div[@id='easter-egg']/following::div"));
        if(counterElem == null){
            return false;
        }

        WebElement resultText =
                driver.findElement(
                        By.xpath("//div[@id='main']/div[@id='cnt']/div[@id='appbar']/div[@id='extabar']/div[@id='topabar']/div[@id='slim_appbar']/div[@id='sbfrm_l']/div[@id='resultStats']"));
        if(StringUtils.isBlank(resultText.getText())){
            return false;
        }

        return true;
    }

    public String getGoogleResultString(){
        return searchElement("resultStats").getText();
    }

    @Override
    public void init(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}

