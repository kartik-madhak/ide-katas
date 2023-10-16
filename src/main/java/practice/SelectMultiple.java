package practice;

import java.io.File;

public class SelectMultiple {
    public static void main(String[] args) {
        String inputFile1 = "/user/user1/input1.txt"; // TODO: Use multi-select and edit user1 -> <your name>. Try using it with Shift key pressed and without Shift key pressed.
        String inputFile2 = "/user/user1/input2.txt";
        String inputFile3 = "/user/user1/input3.txt";
        String inputFile4 = "/user/user1/input4.txt";
        String inputFile5 = "/user/user1/input5.txt";

        System.out.println("inputFile1 exists = " + new File(inputFile1).isFile());
        System.out.println("inputFile2 exists = " + new File(inputFile2).isFile());
        System.out.println("inputFile3 exists = " + new File(inputFile3).isFile());
        System.out.println("inputFile4 exists = " + new File(inputFile4).isFile());
        System.out.println("inputFile5 exists = " + new File(inputFile5).isFile());
    }
}
