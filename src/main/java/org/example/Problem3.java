package org.example;

public class Problem3 {
    public static String fixStart(String stringValue) {
        StringBuilder output = new StringBuilder(stringValue.substring(0, 1));

        for (int i = 1; i < stringValue.length(); i++) {
            if (stringValue.charAt(0) == stringValue.charAt(i)) {
                output.append("*");
            } else {
                output.append(stringValue.charAt(i));
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(fixStart("babble"));
        System.out.println(fixStart("AmaAAn"));
    }
}
