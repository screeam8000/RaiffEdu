package week0.lesson02.sortobj;

public class Value implements Comparable {
    private int val1;
    private String val2;

    public Value(int val1, String val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int getVal1() {
        return this.val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return this.val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String toString()
    { return "Value{val1=" + this.val1 + ", val2='" + this.val2 + '\'' + '}';
    }

    public int compareTo(Object o){
    Value innerValue = (Value)o;
    if (innerValue.val1 > this.val1) {
        return 1;
    } else {
        return innerValue.val1 < this.val1 ? -1 : 0;
    }
    }
}





