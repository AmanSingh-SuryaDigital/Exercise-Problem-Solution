package org.example;

public class Problem5 {

    public static String verbing(String s){
        if (s.length() < 3) {
            return s;
        } else if (s.endsWith("ing")) {
            return s + "ly";
        } else {
            return s + "ing";
        }

    }
    public static void main(String[] args) {
        System.out.println(verbing("Helloworld"));
        System.out.println(verbing("Sing"));
    }

}
