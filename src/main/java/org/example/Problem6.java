package org.example;

public class Problem6 {

    public static String replaceNotBadWithGood(String inputSentence) {

        int notPosition = inputSentence.toLowerCase().indexOf("not".toLowerCase());
        int badPosition = inputSentence.toLowerCase().indexOf("bad".toLowerCase());

        String updatedSentence = inputSentence;

        if (notPosition != -1 && badPosition != -1 && badPosition > notPosition) {
            updatedSentence = inputSentence.replace(inputSentence.substring(notPosition, badPosition + 3), "good");
        }

        return updatedSentence;
    }

    public static void main(String[] args) {

        System.out.println(replaceNotBadWithGood("This dinner is not that bad!"));
    }

}
