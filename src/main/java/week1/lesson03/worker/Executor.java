package week1.lesson03.worker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Executor {
    private static Map<Integer, String> loggableMethods = new HashMap();

    public Executor() {
    }

    @SafeVarargs
    public static void main(String... args) {
        Worker worker = new Worker();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many methods do you want?");
        int methodsCount = scanner.nextInt();

        int rand;
        String methodName;
        for(rand = 0; rand < methodsCount; ++rand) {
            System.out.println("Enter method name!");
            methodName = scanner.next();
            loggableMethods.put(rand, methodName);
        }

        while(true) {
            rand = random.nextInt(methodsCount + 5);
            System.out.println(rand);
            methodName = (String)loggableMethods.get(rand);
            Method[] var7 = worker.getClass().getDeclaredMethods();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                Method method = var7[var9];
                if (method.getName().equals(methodName)) {
                    try {
                        method.invoke(worker, (Object[])null);
                    } catch (IllegalAccessException var12) {
                        var12.printStackTrace();
                    } catch (InvocationTargetException var13) {
                        var13.printStackTrace();
                    }
                }
            }

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var14) {
                var14.printStackTrace();
            }
        }
    }
}



