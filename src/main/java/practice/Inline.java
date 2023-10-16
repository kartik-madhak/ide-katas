package practice;

/*
Rules
Use keyboard shortcuts to do various types of refactorings.
Do not use mouse to do things.
Do not use indirect keyboard shortcuts - like copy-pasting manually instead of inlining vars/methods
*/


public class Inline {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void addInlineMethod(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b); // TODO: use method inline shortcut to replace the simple implementation directly in this code
        System.out.println("The sum is " + sum);
    }

    public static void addInlineVariable(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        int sum = a + b + c + d;

        double average = sum / 4.0;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average); // TODO: use variable inline shortcut to replace the simple implementation directly in this code
    }
}
