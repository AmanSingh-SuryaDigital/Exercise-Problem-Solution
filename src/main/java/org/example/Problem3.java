package org.example;

public class Problem3 {
    public static String replaceRepeatedFirstChar(String inputString) {

        StringBuilder modifiedStringBuilder = new StringBuilder(inputString.substring(0, 1));

        char []ch=inputString.toCharArray();

        int count=0;
        for(char c: ch){
            if( count >=1 && c==ch[0]){
                modifiedStringBuilder.append("*");
            }
            else if(count >=1){
                modifiedStringBuilder.append(c);
            }
            count++;
        }

        return modifiedStringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(replaceRepeatedFirstChar("babble"));
        System.out.println(replaceRepeatedFirstChar("AmaAAn"));
    }
}

