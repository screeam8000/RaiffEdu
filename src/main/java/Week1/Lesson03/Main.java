package Week1.Lesson03;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int [] masOfInts = new int [10];
        int [] masOfInts2;
        masOfInts2 = new int [5];

        int [] masOfIntsCreated = {1, 2, 3, 4};
        System.out.println(masOfIntsCreated[0]);
        masOfIntsCreated[1] = 7;

        String [] massOfStrings = {"Art", "Dem"};

        Parent [] parents = new Parent [5];
        parents [0] = new Parent(10);
        parents [1] = new Child(6);

        System.out.println(parents[0].getAge());
        System.out.println(parents[1].getAge());

        Objects[] objects = new Objects[10];
        objects[0] = "Message";
        objects [1]  = new Parent(10);
        objects [2] = new StringBuffer();

        int[][] matrixOfInts = new int[7][7];
        int [][][] cubeOfInts = new int[2][2][2];
        int [][] matrixOfIntsCreated = {{1,2,3}, {3,4}, {5,6,7,9}};

    }
}
