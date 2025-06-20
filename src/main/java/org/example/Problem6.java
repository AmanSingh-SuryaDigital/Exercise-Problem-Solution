package org.example;

public class Problem6 {

    public static String replaceNotBadWithGood(String inputSentence) {

        int notPosition = inputSentence.toLowerCase().indexOf("not");
        int badPosition = inputSentence.toLowerCase().indexOf("bad");

        if (badPosition == -1 || notPosition == -1) {
            return inputSentence;
        }

        String updatedSentence = inputSentence;

        if (badPosition > notPosition) {
            updatedSentence = inputSentence.replace(inputSentence.substring(notPosition, badPosition + 3), "good");
        }

        return updatedSentence;
    }

    public static void main(String[] args) {

        System.out.println(replaceNotBadWithGood("This dinner is not that bad!"));
        System.out.println(replaceNotBadWithGood("This dinner is n bad that good!"));
        System.out.println(replaceNotBadWithGood("The movie is not so bad."));
        System.out.println(replaceNotBadWithGood("The movie"));
    }

}
