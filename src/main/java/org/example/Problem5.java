package org.example;

public class Problem5 {

    public static String verbing(String stringValue1){
        if (stringValue1.length() < 3) {
            return stringValue1;
        } else if (stringValue1.endsWith("ing")) {
            return stringValue1 + "ly";
        } else {
            return stringValue1 + "ing";
        }

    }

    public static void main(String[] args) {
        System.out.println(verbing("Helloworld"));
        System.out.println(verbing("Sing"));
    }

}
