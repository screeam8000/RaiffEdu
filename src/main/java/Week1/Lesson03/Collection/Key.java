package Week1.Lesson03.Collection;

public class Key implements Comparable<Key> {
    private int val1;
    private int val2;
    private int val3;

    public Key(int val1, int val2, int val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public Key (int val1, int val2, int val3){
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public boolean equals(Object o) {
        if (this == o)
        return true;
    } else if (o != null && this.getClass() == o.getClass()) {
        Key key = (Key)o;
        if (this.val1 != key.val1){
            return false;
        } else if (this.val2 != key.val2) {
            return false;
        } else {
            return this.val3 == key.val3;
        }
    } else {
        return false;
    }
}

    public int hashCode() {
        int result = this.val1;
        result = 31 * result + this.val2;
        result = 31 * result + this.val3;
        return result;
    }

    public String toString()  {
        return "Key{val1=" + this.val1 + ", val2=" + this.val2 + ", val3=" + this.val3 + '}';
    }

    public int compareTo(Key o){
    if (this.val1 > o.val1) {
        return 1;
    } else {
        return this.val1 < o.val1 ? -1 : 0;
    }
    }
}



