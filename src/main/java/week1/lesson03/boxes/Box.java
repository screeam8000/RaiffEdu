package week1.lesson03.boxes;

import java.util.ArrayList;
import java.util.List;

public abstract class Box {
    protected List<Object> value = new ArrayList<>();

    protected void addToBox(Object value){
        this.value.add(value);

    }
}
