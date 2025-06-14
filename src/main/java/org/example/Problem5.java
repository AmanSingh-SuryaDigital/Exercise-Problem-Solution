package org.example;

public class Problem5 {

    public static String verbing(String word) {
        if (word.length() < 3) {
            return word;
        } else if (word.endsWith("ing")) {
            return word + "ly";
        } else {
            return word + "ing";
        }
    }

    public static void main(String[] args) {
        System.out.println(verbing("Helloworld"));
        System.out.println(verbing("Sing"));
    }

}
