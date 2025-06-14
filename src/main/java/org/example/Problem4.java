package org.example;

public class Problem4 {

    public static String mixUp(String firstWord, String secondWord) {

        String swappedFirst = secondWord.substring(0, 2) + firstWord.substring(2);
        String swappedSecond = firstWord.substring(0, 2) + secondWord.substring(2);

        return swappedFirst + " " + swappedSecond;
    }

    public static void main(String[] args) {

        System.out.println(mixUp("mix", "pod"));
        System.out.println(mixUp("Aman", "Singh"));
    }

}
