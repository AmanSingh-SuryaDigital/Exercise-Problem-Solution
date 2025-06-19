package org.example;

public class Problem5 {

    public static String addVerbSuffix(String inputWord) {

        if (inputWord.length() < 3) {
            return inputWord;
        } else if (inputWord.trim().toLowerCase().endsWith("ing")) {
            return inputWord.trim() + "ly";
        } else {
            return inputWord.replaceAll("\\s","") + "ing";
        }
    }

    public static void main(String[] args) {
        System.out.println(addVerbSuffix("Helloworlding "));
        System.out.println(addVerbSuffix("Sing"));
        System.out.println(addVerbSuffix("Helloworld ING "));
        System.out.println(addVerbSuffix("SiNg "));

    }

}
