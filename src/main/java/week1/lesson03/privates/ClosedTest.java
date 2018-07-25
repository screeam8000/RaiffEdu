package week1.lesson03.privates;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClosedTest {
    public ClosedTest() {
    }

    public static void main(String[] args) {
        ClosedClass closedClassExamplar = new ClosedClass();
        closedClassExamplar.publicMethod();

        try {
            Field privateStateField = closedClassExamplar.getClass().getDeclaredField("privateState");
            privateStateField.setAccessible(true);
            Object value = privateStateField.get(closedClassExamplar);
            if ((Integer)value == 10) {
                System.out.println("Test ok!");
            }

            Method method = closedClassExamplar.getClass().getDeclaredMethod("privateMethod");
            method.setAccessible(true);
            method.invoke(closedClassExamplar, (Object[])null);
            Object value2 = privateStateField.get(closedClassExamplar);
            if ((Integer)value2 == 11) {
                System.out.println("Test ok again!");
            }
        } catch (NoSuchFieldException var6) {
            var6.printStackTrace();
        } catch (IllegalAccessException var7) {
            var7.printStackTrace();
        } catch (NoSuchMethodException var8) {
            var8.printStackTrace();
        } catch (InvocationTargetException var9) {
            var9.printStackTrace();
        }

    }
}
