package Week1.Lesson01.OOP.dirty;

public class Animal {
    protected String voice;

    Animal(){this.dirtyMethod();}

    private void dirtyMethod(){
        if (this.voice.equals("bow, wow")){
            System.out.println("Dog yelling");
        }
    }

}
