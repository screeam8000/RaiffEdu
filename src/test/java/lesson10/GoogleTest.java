package lesson10;

import lesson10.pages.GoogleSearchPage;
import lesson10.pages.strategy.SearchElementByIdStrategy;
import lesson10.pages.validate.GooglePageValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest {

    private static final String WEBDRIVER_CHROME_DRIVER_KEY = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER = "/Users/scream8000/Development/chromedriver";

    private static ChromeDriver chromeDriver;

    @BeforeAll
    public static void init(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER_KEY, WEBDRIVER_CHROME_DRIVER);
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }
//
//    @Test
//    public void testSearch(){
//        chromeDriver.get("https://www.google.com/");
//
//        WebElement searchInputElement = chromeDriver.findElement(By.id("lst-ib"));
//        searchInputElement.sendKeys("Ramin Djawadi");
//        searchInputElement.sendKeys(Keys.RETURN);
//
//        assertEquals("Ramin Djawadi - Поиск в Google", chromeDriver.getTitle());
//
//        WebDriverWait waiter= new WebDriverWait(chromeDriver, 10);
//        WebElement longWaitResults =
//                waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("rso")));
//
//        WebElement divResults = chromeDriver.findElement(By.id("rso"));
//        assertNotNull(divResults);
//
//        List<WebElement> divResultList = chromeDriver.findElements(By.className("bkWMgd"));
//        assertTrue(divResultList.size() > 0);
//
//        List<WebElement> devResultListInner =
//                chromeDriver.findElements(By.cssSelector("div.bkWMgd > div.srg"));
//        assertTrue(devResultListInner.size() > 0);
//
//
//        WebElement counterElem =
//                chromeDriver.findElement(By.xpath("//div[@id='easter-egg']/following::div"));
//        assertNotNull(counterElem);
//
//        WebElement resultText =
//                chromeDriver.findElement(
//                        By.xpath("//div[@id='main']/div[@id='cnt']/div[@id='appbar']/div[@id='extabar']/div[@id='topabar']/div[@id='slim_appbar']/div[@id='sbfrm_l']/div[@id='resultStats']"));
//        System.out.println(resultText.getText());
//
//        chromeDriver.quit();
//    }

//    @Test
//    public void testSearchPage(){
//        chromeDriver.get("https://www.google.com/");
//        GoogleSearchPage googleSearchPage =
//                new GoogleSearchPage();
//        googleSearchPage.init(chromeDriver);
//
//        googleSearchPage.search("Fabrizio Paterlini");
//        GooglePageValidator googlePageValidator =
//                new GooglePageValidator();
//        assertTrue(googlePageValidator.isValid(chromeDriver));
//
//        assertTrue(googleSearchPage.isSearchResultAvailable());
//        chromeDriver.quit();
//    }

    @Test
    public void testGetResults(){
        chromeDriver.get("https://www.google.com/");
        GoogleSearchPage googleSearchPage =
                new GoogleSearchPage();
        googleSearchPage.init(chromeDriver);
        googleSearchPage
                .setSearchElementStrategy(
                        new SearchElementByIdStrategy(chromeDriver));

        googleSearchPage.search("Fabrizio Paterlini");
        assertTrue(
                !StringUtils
                        .isBlank(googleSearchPage
                                .getGoogleResultString()
                        )
        );
        chromeDriver.quit();
    }
}

