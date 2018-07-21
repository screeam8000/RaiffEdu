package week0.lesson00.oop.dirty;

public class Dog extends Animal {
    Dog() {
        //Animal(); неявно
        super("bow wow");
        voice = "bow wow";
    }
}
