package week0.lesson01.exceptions;

public class MainReturn {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception ex) {
            System.out.println("Ex!");

            int[] mas = new int[4];
            System.out.println(mas[5]);
        } finally {
            return;
        }
    }
}
