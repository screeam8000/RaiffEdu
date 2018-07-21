package week1.Lesson04.Boxes;

import java.util.ArrayList;
import java.util.List;

public abstract class Box {
    protected List<Object> value = new ArrayList<>();

    protected void addToBox(Object value){
        this.value.add(value);

    }
}
