package Week1.Lesson01.OOP.dirty;

public class Animal {
    protected String voice;

    public Animal(){this.dirtyMethod();}

    public Animal(String aby, String brown, boolean b, int i) {

    }

    public Animal(String zorkii, String black, short i, int i1) {

    }

    private void dirtyMethod(){
        if (this.voice.equals("bow, wow")){
            System.out.println("Dog yelling");
        }
    }

}
