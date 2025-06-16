package org.example;

public class Problem3 {
    public static String replaceRepeatedFirstChar(String inputString) {

        StringBuilder modifiedString = new StringBuilder(inputString.substring(0, 1));
        char initialCharacter = inputString.charAt(0);

        for (int i = 1; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == initialCharacter) {
                modifiedString.append("*");
            } else {
                modifiedString.append(currentChar);
            }
        }

        return modifiedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceRepeatedFirstChar("babble"));
        System.out.println(replaceRepeatedFirstChar("AmaAAn"));
    }
}

