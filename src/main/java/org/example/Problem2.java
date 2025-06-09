package org.example;

public class Problem2 {

    public static String bothEnds(String s) {
        if (s.length() < 2) {
            return "";
        } else {
            String firstTwo = s.substring(0, 2);
            String lastTwo = s.substring(s.length() - 2);
            return firstTwo + lastTwo;
        }
    }

    public static void main(String[] args) {
        System.out.println(bothEnds("AmanSingh"));
        System.out.println(bothEnds("a"));
        System.out.println(bothEnds("helloWorld"));
    }

}
