package practice;

import java.nio.file.Files;
import java.nio.file.Paths;

// TODO: add a multiline comment here using ctrl + shift + / to describe the class in your words!
public class AddADoc {
    public static String readFile(String fileName) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
