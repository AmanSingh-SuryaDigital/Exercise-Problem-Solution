package org.example;

public class Problem3 {
    public static String fixStart(String input) {
        StringBuilder result = new StringBuilder(input.substring(0, 1));
        char firstChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == firstChar) {
                result.append("*");
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fixStart("babble"));
        System.out.println(fixStart("AmaAAn"));
    }
}
