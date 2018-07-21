package week0.lesson00.oop.dirty;

public class Animal {
    protected String voice;

    public Animal(String voice) {
        this.voice = voice;
        dirtyMethod();
    }

    Animal() {
        dirtyMethod();
    }

    private void dirtyMethod() {
        if(voice.equals("bow wow")) {
            System.out.println("Dog yelling!");
        }
    }
}
