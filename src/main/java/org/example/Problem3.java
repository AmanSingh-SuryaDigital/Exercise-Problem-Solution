package org.example;

public class Problem3 {
    public static  String fixStart(String value){

        String  output=value.substring(0,1);

        for(int i=1; i<value.length(); i++){
            if(value.charAt(0)==value.charAt(i)){

                output=output + "*";
            }
            else{
                output=output+value.charAt(i);
            }

        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(fixStart("babble"));
        System.out.println(fixStart("AmaAAn"));
    }
}
