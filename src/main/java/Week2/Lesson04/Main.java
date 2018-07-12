package Week2.Lesson04;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> coffeeQueue = new ArrayDeque<String>();

        coffeeQueue.add("Joseph Stalin");
        coffeeQueue.add("Benito Mussalini");
        coffeeQueue.add("John Carter");
        coffeeQueue.add("Cheguevara");

        System.out.println(coffeeQueue);

        System.out.println(coffeeQueue.element());
        System.out.println(coffeeQueue.element());
        System.out.println(coffeeQueue);

        coffeeQueue.offer("Yuston Cherchill");
        coffeeQueue.offer("Cheguevara");
        System.out.println(coffeeQueue);

        System.out.println(coffeeQueue.peek());
        System.out.println(coffeeQueue.peek());
        System.out.println(coffeeQueue.peek());
        System.out.println(coffeeQueue.peek());
        System.out.println(coffeeQueue);

        System.out.println(coffeeQueue.poll());
        System.out.println(coffeeQueue.poll());
        System.out.println(coffeeQueue.poll());
        System.out.println(coffeeQueue.poll());
        System.out.println(coffeeQueue);

            }
}
