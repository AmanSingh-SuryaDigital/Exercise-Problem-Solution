package org.example;

public class Problem4 {

    public static String swapFirstTwoCharacters(String firstWord, String secondWord) {

        String swappedFirstWord = secondWord.substring(0, 2) + firstWord.substring(2);
        String swappedSecondWord = firstWord.substring(0, 2) + secondWord.substring(2);

        return swappedFirstWord + " " + swappedSecondWord;
    }

    public static void main(String[] args) {

        System.out.println(swapFirstTwoCharacters("mix", "pod"));
        System.out.println(swapFirstTwoCharacters("Aman", "Singh"));
    }

}
