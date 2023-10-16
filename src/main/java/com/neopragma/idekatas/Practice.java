package com.neopragma.idekatas;

/*
Rules
Use keyboard shortcuts to do various types of refactorings.
Do not use mouse to do things.
Do not use indirect keyboard shortcuts - like copy-pasting manually instead of inlining vars/methods
*/


public class Practice {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b); // TODO: use method inline shortcut to replace the simple implementation directly in this code
        System.out.println("The sum is " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
