package org.example;

public class Problem6 {

    public static String notbad(String sentence){

        int notposition=sentence.indexOf("not");
        int badposition=sentence.indexOf("bad");

        String updateSentence="";

        if(badposition>notposition){
            updateSentence  = sentence.replace(sentence.substring(notposition,badposition+3),"good");
        }

        return updateSentence;
    }

    public static void main(String[] args) {

        System.out.println(notbad("This dinner is not that bad!"));
    }

}
