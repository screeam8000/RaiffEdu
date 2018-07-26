package deliveryclubtest.data;

import java.util.ArrayList;
import java.util.List;

public class MenuCheckerDataSupplier {
    public static List<MenuChoiceTestPair> getTestData(){
        List<MenuChoiceTestPair> pairList =
                new ArrayList<>();

        MenuChoiceTestPair pair1 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tDelivery Club - заказ и доставка еды. Все службы доставки: еда на дом и в офис в Москве - удобно, круглосуточно и бесплатно!\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "",
                        "Все рестораны");
        MenuChoiceTestPair pair2 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tДоставка пиццы в Москве, круглосуточный онлайн заказ пиццы на дом или в офис - Delivery Club\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "Пицца",
                        "Пицца");
        MenuChoiceTestPair pair3 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tДоставка суши на дом в Москве, онлайн заказ суши и роллов, заказать роллы в Москве с бесплатной доставкой в Delivery Club\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "Суши",
                        "Суши");
        MenuChoiceTestPair pair4 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tГорячие шашлыки с доставкой на дом в Москве — Delivery Club\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "Шашлыки",
                        "Шашлыки");
        MenuChoiceTestPair pair5 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tОсетинские пироги с доставкой на дом, заказ и бесплатная доставка в Москве от Delivery Club\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "Пироги",
                        "Пироги");
        MenuChoiceTestPair pair6 =
                new MenuChoiceTestPair("\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\tДоставка бургеров и гамбургеров от Delivery Club Москва\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \n" +
                        "\t",
                        "Бургеры",
                        "Бургеры");

        pairList.add(pair1);
        pairList.add(pair2);
        pairList.add(pair3);
        pairList.add(pair4);
        pairList.add(pair5);
        pairList.add(pair6);

        return pairList;
    }
}

