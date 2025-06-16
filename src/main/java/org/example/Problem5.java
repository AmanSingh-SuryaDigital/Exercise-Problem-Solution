package org.example;

public class Problem5 {

    public static String addVerbSuffix(String inputWord) {
        if (inputWord.length() < 3) {
            return inputWord;
        } else if (inputWord.endsWith("ing")) {
            return inputWord + "ly";
        } else {
            return inputWord + "ing";
        }
    }

    public static void main(String[] args) {
        System.out.println(addVerbSuffix("Helloworld"));
        System.out.println(addVerbSuffix("Sing"));
    }

}
