package org.example;

public class Problem5 {

    public static String addVerbSuffix(String inputWord) {

        if (inputWord.length() < 3) {
            return inputWord;
        } else if (inputWord.replaceAll("\\s","").toLowerCase().endsWith("ing")) {
            return inputWord.replaceAll("\\s","").toLowerCase() + "ly";
        } else {
            return inputWord.replaceAll("\\s","").toLowerCase() + "ing";
        }
    }

    public static void main(String[] args) {
        System.out.println(addVerbSuffix("Helloworlding "));
        System.out.println(addVerbSuffix("Sing"));
        System.out.println(addVerbSuffix("Helloworld ING "));

    }

}
