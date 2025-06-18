package org.example;

public class Problem3 {
    public static String replaceRepeatedFirstChar(String inputString) {

        StringBuilder modifiedStringBuilder = new StringBuilder(inputString.substring(0, 1));

        for (int i = 1; i < inputString.length(); i++) {

            if (inputString.charAt(i) == inputString.charAt(0)) {
                modifiedStringBuilder.append("*");
            } else {
                modifiedStringBuilder.append(inputString.charAt(i));
            }
        }

        return modifiedStringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceRepeatedFirstChar("babble"));
        System.out.println(replaceRepeatedFirstChar("AmaAAn"));
    }
}

