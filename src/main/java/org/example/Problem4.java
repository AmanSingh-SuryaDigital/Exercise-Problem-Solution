package org.example;

public class Problem4 {

    public static String swapFirstTwoCharacters(String firstWord, String secondWord) {

        if(firstWord.length() < 2 && secondWord.length() < 2){
            return "Input length should be more than 2";
        }

        String modifiedInputOne = secondWord.substring(0, 2) + firstWord.substring(2);
        String modifiedInputSecond = firstWord.substring(0, 2) + secondWord.substring(2);

        return modifiedInputOne + " " + modifiedInputSecond;
    }

    public static void main(String[] args) {

        System.out.println(swapFirstTwoCharacters("mix", "pod"));
        System.out.println(swapFirstTwoCharacters("Aman", "Singh"));
        System.out.println(swapFirstTwoCharacters("ab","cd"));
    }

}
