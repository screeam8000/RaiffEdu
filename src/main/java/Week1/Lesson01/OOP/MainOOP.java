package Week1.Lesson01.OOP;

import Week1.Lesson01.OOP.Parents.Child;
import javafx.scene.Parent;

public class MainOOP {
    public MainOOP() {
        }

        public static void main(String[] args){
            Parent parent = new Parent();
            parent.familyName = "Kate";
            System.out.println(parent.familyName);
            new Child();
            ++Parent.counter;
            ++Parent.counter;

        }
}
