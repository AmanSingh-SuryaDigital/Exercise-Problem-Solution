package org.example;

public class Problem7 {

    public static String frontBack(String first, String second) {

        int firstMid = first.length() / 2;
        int secondMid = second.length() / 2;

        if (first.length() % 2 == 1) {
            firstMid += 1;
        }

        if (second.length() % 2 == 1) {
            secondMid += 1;
        }

        String firstFront = first.substring(0, firstMid);
        String secondFront = second.substring(0, secondMid);
        String firstBack = first.substring(firstMid);
        String secondBack = second.substring(secondMid);

        return firstFront + secondFront + firstBack + secondBack;
    }

    public static void main(String[] args) {

        System.out.println(frontBack("abcd","xy"));
        System.out.println(frontBack("abcdefg","xyz"));
    }

}
