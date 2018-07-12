package Lesson04.Worker;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Executor {
    private static Map<Integer, String> loggableMethods = new HashMap<>();

    public static void main(String[] args) {
        Worker worker = new Worker();
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many");
        int methodsCount = scanner.nextInt();

        for (int i = 0; i < methodsCount)

       while(true){
           int rand = random.nextInt(5);
           String methodName =loggableMethods.get(rand);

           for (Method method){
               worker.getClass().getDeclaredMethods();
            }
        }
    }

    if (rand == 6){

    }
}

