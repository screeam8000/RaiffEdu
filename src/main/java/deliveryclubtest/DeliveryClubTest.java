package deliveryclubtest;

import deliveryclubtest.checkers.MenuMealChecker;
import deliveryclubtest.checkers.MenuTestPairChecker;
import deliveryclubtest.data.DriverPool;
import deliveryclubtest.data.MenuCheckerDataSupplier;
import deliveryclubtest.data.MenuChoiceTestPair;
import deliveryclubtest.pages.DeliveryClubMainPageObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DeliveryClubTest {

    @Test
    public void pizzaTest() {
        WebDriver localDriver = DriverPool.instance.pollDriver();

        localDriver.get("https://www.delivery-club.ru/");
        DeliveryClubMainPageObject deliveryClubMainPageObject =
                new DeliveryClubMainPageObject();
        deliveryClubMainPageObject.init(localDriver);

        deliveryClubMainPageObject.gotoPizzaMenu();
        deliveryClubMainPageObject.searchByAddr("Москва, проспект Андропова, 18к1");

        MenuMealChecker menuMealChecker =
                new MenuMealChecker(deliveryClubMainPageObject);
        assertTrue(menuMealChecker.getWrongList().toString(), menuMealChecker.check());

        assertEquals("Поиск блюд и ресторанов",
                deliveryClubMainPageObject
                        .getSearchMealField()
                        .getPlaceholderText());

        DriverPool.instance.releaseDriver(localDriver);
    }

    @Test
    public void menuTest(){
        WebDriver localDriver = DriverPool.instance.pollDriver();

        localDriver.get("https://www.delivery-club.ru/");
        DeliveryClubMainPageObject deliveryClubMainPageObject =
                new DeliveryClubMainPageObject();
        deliveryClubMainPageObject.init(localDriver);

        for (MenuChoiceTestPair pair:
                MenuCheckerDataSupplier.getTestData()) {
            deliveryClubMainPageObject.gotoMenu(pair.getClickedMenuName());
            deliveryClubMainPageObject.searchByAddr("Москва, проспект Андропова, 18к1");

            MenuTestPairChecker checker = new MenuTestPairChecker(deliveryClubMainPageObject, pair);
            assertTrue(checker.getWrongList().toString(), checker.check());
        }

        DriverPool.instance.releaseDriver(localDriver);
    }

}

