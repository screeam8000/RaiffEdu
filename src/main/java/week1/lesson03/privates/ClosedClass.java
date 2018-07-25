package week1.lesson03.privates;


public class ClosedClass {
    private int privateState;

    public ClosedClass() {
    }

    private void privateMethod() {
        ++this.privateState;
    }

    public void publicMethod() {
        this.privateState = 10;
    }
}

