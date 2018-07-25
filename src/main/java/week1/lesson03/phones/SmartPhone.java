package week1.lesson03.phones;

public class SmartPhone implements Phone {
    @Override
    public String questionAnswer(String message) {
        return "my bla bla" + message + "is ok!!";
    }
}
