package week1.lesson04;

import week1.lesson04.generic.GenericBox;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        GenericBox<String> stringBox =
                new GenericBox<String>("msg");
        stringBox.setValue("new message");
        //stringBox.setValue(100);

        GenericBox<Integer> integerBox =
                new GenericBox<Integer>(1);
        integerBox.setValue(100);
        //integerBox.setValue("message");

        try {
            Field field =
                    GenericBox
                            .class
                            .getDeclaredField("value");

            System.out.println(field.getType().getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
