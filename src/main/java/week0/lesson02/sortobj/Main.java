package week0.lesson02.sortobj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Value[] values = new Value[] {
                new Value(1, "10"),
                new Value(2, "76"),
                new Value(3, "109"),
                new Value(4, "8745"),
                new Value(5, "543"),
                new Value(6, "10")};

        Arrays.sort(values);
        Value[] var2 = values;
        int var3 = values.length;

        int var4;
        Value value;
        for (var4 = 0; var4 < var3; ++var4) {
            value = var2[var4];
            System.out.println(value.toString());
        }

        System.out.println("______________");
        Arrays.sort(values, new ValueByVal2Comparator());
        var2 = values;
        var3 = values.length;

        for(var4 = 0; var4 < var3; ++var4) {
        value = var2[var4];
            System.out.println(value.toString());
        }
    }
}


