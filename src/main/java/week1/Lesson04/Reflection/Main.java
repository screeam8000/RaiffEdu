package week1.Lesson04.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Class parentClass = Parent.class;
        Child child = new Child();
        Class childClass = child.getClass();

        System.out.println(parentClass.getName());
        System.out.println(parentClass.getCanonicalName());
        for (Field field:
             parentClass.getFields()) {
            System.out.println(field.getType());
        }

        System.out.println("____________");
        for (Field field:
             parentClass.getDeclaredFields()) {
            System.out.println(field.getType());
            System.out.println(" ");
            System.out.println(field.getName());
            System.out.println(" ");
            System.out.println(field.getModifiers());
        }

        System.out.println("______________");
        for (Method method :
                childClass.getMethods()) {
            System.out.println();

            for (Parameter: method.getParameters());
                 ) {

            }

            for (Class:
                 childClass.getGenericInterfaces()
                 ) {

            }
        }


                ) {

        }
        }
    }