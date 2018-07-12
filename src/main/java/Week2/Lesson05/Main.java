package Week2.Lesson05;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        GenericBox<String> stringBox =
                new GenericBox<String>("msg");

        GenericBox<Integer> integercBox =
        new GenericBox<>(1);

        try {
            Field field = GenericBox
                    .class
                    .getDeclaredField()
        }
    }
}
