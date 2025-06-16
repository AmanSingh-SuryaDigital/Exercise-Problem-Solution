package org.example;

public class Problem2 {

    public static String getFirstAndLastTwoChars(String input) {
        if (input.length() < 2) {
            return "";
        } else {
            String firstTwoChars = input.substring(0, 2);
            String lastTwoChars = input.substring(input.length() - 2);
            return firstTwoChars + lastTwoChars;
        }
    }

    public static void main(String[] args) {
        System.out.println(getFirstAndLastTwoChars("AmanSingh"));
        System.out.println(getFirstAndLastTwoChars("a"));
        System.out.println(getFirstAndLastTwoChars("helloWorld"));
    }

}
