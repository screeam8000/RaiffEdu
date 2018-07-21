package week0.lesson01.exceptions;

public class Main {

    public static void main(String[] args) {
        String message = null;

        //"ABC".equals(message) !!!
        try {
            if (message.equals("ABC")){
                System.out.println(message);
            }
        } catch (NullPointerException npe) {
            npe.getStackTrace();
        } catch (ArithmeticException are) {
            are.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Another Ex");
        } finally {
            System.out.println("Final here");
        }
    }
}
