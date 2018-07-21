package week0.lesson01.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTWR {
    public static void main(String[] args) {
        File file = new File("1.txt");

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(file)){
    } catch (IOException ex) {
            ex.fillInStackTrace();
    }
    }
}
