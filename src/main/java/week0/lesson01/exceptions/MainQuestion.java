package week0.lesson01.exceptions;

public class MainQuestion {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException are) {
            System.out.println("ARE!!!");
            String msg = null;
            System.out.println(msg.equals("a"));
        } catch (NullPointerException npe) {
            System.out.println("NPE");
            int [] mas = new int[3];
            System.out.println(mas[4]);
        } catch (Exception ex) {
            System.out.println("EX!!");
        } finally {
            System.out.println("Fail is here!!!");
        }
    }
}
