package Lesson04.Boxes;

import sun.tools.asm.CatchData;

public class Main {
    public static void main(String[] args) {
        RestrictedBox restrictedBox = new RestrictedBox();

        restrictedBox.addToBox(new ValueCat());
        restrictedBox.addToBox(new ValueBall());
        restrictedBox.addToBox(new ValuePoison());

        BigBox bigBox = new BigBox;
        SmallBox smallBox = new SmallBox();
        for (int i = 0; i < 15; i++){
            System.out.println("Adding to big Box" + i);
            bigBox.addToBox(new CatchData());
        }
    }
}
