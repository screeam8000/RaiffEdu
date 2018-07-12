package Lesson04.Privates;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClosedTest {
    public static void main(String[] args) {
        ClosedClass closedClass = new ClosedClass();
        closedClass.publicMethod();

        try {
            Field privatesStateField =
                    closedClassExamplar
                    .getClass ();
                    .getDeclaredMethod(name "privateMethod")

                    method.setAccessible(true);
                    method.invoke(closedClassExamplar, null);

                    Object value2 = privatesStateField
                            .get(closedClass)
        }

        Field privateStateField =

                if((int)value == 10);
        System.out.println("Ok!");
    }

    Method method = closedClass;


} catch
