package org.example;

public class Problem6 {

    public static String notbad(String sentence) {

        int notIndex = sentence.indexOf("not");
        int badIndex = sentence.indexOf("bad");

        String resultSentence = sentence;

        if (notIndex != -1 && badIndex != -1 && badIndex > notIndex) {
            resultSentence = sentence.replace(sentence.substring(notIndex, badIndex + 3), "good");
        }

        return resultSentence;
    }

    public static void main(String[] args) {

        System.out.println(notbad("This dinner is not that bad!"));
    }

}
