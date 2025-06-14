package org.example;

public class Problem2 {

    public static String creatingStringFromBothEnds(String input) {
        if (input.length() < 2) {
            return "";
        } else {
            String firstTwo = input.substring(0, 2);
            String lastTwo = input.substring(input.length() - 2);
            return firstTwo + lastTwo;
        }
    }

    public static void main(String[] args) {
        System.out.println(creatingStringFromBothEnds("AmanSingh"));
        System.out.println(creatingStringFromBothEnds("a"));
        System.out.println(creatingStringFromBothEnds("helloWorld"));
    }

}
