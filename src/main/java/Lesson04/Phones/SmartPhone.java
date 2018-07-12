package Lesson04.Phones;

public class SmartPhone implements Phone {
    @Override
    public String questionAnswer(String message) {
        return "my bla bla" + message + "is ok!!";
    }
}
