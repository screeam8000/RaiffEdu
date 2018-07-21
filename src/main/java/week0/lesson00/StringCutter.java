package week0.lesson00;

public class StringCutter {
    public StringCutter()

    {

    }

    public static void main(String[] args) {
        String message = "Съешь этих мягких французкий булочек, да выпей чаю";
        System.out.println(message.indexOf(1080));
        System.out.println(message.indexOf("выпей"));
        System.out.println(message.indexOf(1080, message.indexOf(1080) + 1));
        int indexOfSoft = message.indexOf("мягких");
        int indexOfDrink = message.indexOf("выпей");
        System.out.println(message.substring(indexOfSoft, indexOfDrink));
        System.out.println(message.length());
        if (message.contains("ча")) {
            System.out.println("Мы нашли ЧА");
        }

        String[] var4 = message.split(" ");
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            String temp = var4[var6];
            System.out.println(temp);
        }

        String numberMessage = "1239867354243";
        if (numberMessage.matches("\\d+")) {
            System.out.println("Equals!");
        }

        System.out.println(message.replace("чаю", "кофе"));
    }
}
