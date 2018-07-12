package Week2.Lesson04;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main2 {
    public static void main(String[] args) {
        Deque<String> trafficJam = new ArrayDeque<>();

        trafficJam.add("Prius");
        trafficJam.add("Granta");
        trafficJam.add("Fabia");
        trafficJam.add("Pajero");

        System.out.println(trafficJam);

        trafficJam.addFirst("Porshe");
        trafficJam.addLast("Cadillac");

        System.out.println(trafficJam);

        trafficJam.pollFirst();
        trafficJam.pollLast();
        System.out.println(trafficJam);

    }
}
