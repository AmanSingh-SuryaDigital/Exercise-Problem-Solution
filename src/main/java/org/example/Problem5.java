package org.example;

public class Problem5 {

    public static String addVerbSuffix(String inputWord) {

        if (inputWord.length() <= 3) {
            return inputWord;
        } else if (inputWord.toLowerCase().trim().endsWith("ing")) {
            return inputWord.trim() + "ly";
        } else {
            return inputWord.trim() + "ing";
        }
    }

    public static void main(String[] args) {
        System.out.println(addVerbSuffix("Helloworlding "));
        System.out.println(addVerbSuffix("SIng"));
        System.out.println(addVerbSuffix("Helloworld ING "));
        System.out.println(addVerbSuffix("SiNg "));
        System.out.println(addVerbSuffix("Hello worldinG "));
        System.out.println(addVerbSuffix("Hello world in g"));
        System.out.println(addVerbSuffix("Hello world "));

    }

}
