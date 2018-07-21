package week0.lesson02;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        int [] masOfInts = {1, 3, 5, 7, 654, 56, 423, 54, 23};
        Arrays.sort(masOfInts);
        System.out.println(Arrays.toString(masOfInts));
            int[] masOfIntsExtended =
        Arrays.copyOf(masOfInts, masOfInts.length + 5);
            int [] masOfIntsMin = Arrays.copyOf(masOfInts, 5);
        System.out.println();
        System.out.println();

        //Arrays.deepEquals(masOfInts, masOfIntsExtended)

        System.out.println(
        Arrays.binarySearch(masOfInts, 56, 3, 8));

        System.arraycopy(masOfInts, 5, masOfIntsExtended, 5, 6);
        System.out.println(Arrays.toString(masOfIntsExtended));

    }
}
