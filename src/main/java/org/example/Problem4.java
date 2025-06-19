package org.example;

public class Problem4 {

    public static String swapFirstTwoCharacters(String firstInput, String secondInput) {

        if(firstInput.length() < 2 && secondInput.length() < 2){
            return "Input length should be more than 2";
        }

        String outputFirstPart = secondInput.substring(0, 2) + firstInput.substring(2);
        String outputSecondPart = firstInput.substring(0, 2) + secondInput.substring(2);

        return outputFirstPart + " " + outputSecondPart;
    }

    public static void main(String[] args) {

        System.out.println(swapFirstTwoCharacters("mix", "pod"));
        System.out.println(swapFirstTwoCharacters("Aman", "Singh"));
        System.out.println(swapFirstTwoCharacters("ab","cd"));
    }

}
