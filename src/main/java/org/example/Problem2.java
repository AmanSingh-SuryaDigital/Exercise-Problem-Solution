package org.example;

public class Problem2 {

    public static String creatingStringFromBothEnds(String word) {
        if (word.length() < 2) {
            return "";
        } else {
            String firstTwoSubstring = word.substring(0, 2);
            String lastTwoSubstring = word.substring(word.length() - 2);
            return firstTwoSubstring + lastTwoSubstring;
        }
    }

    public static void main(String[] args) {
        System.out.println(creatingStringFromBothEnds("AmanSingh"));
        System.out.println(creatingStringFromBothEnds("a"));
        System.out.println(creatingStringFromBothEnds("helloWorld"));
    }

}
