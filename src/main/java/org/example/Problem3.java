package org.example;

public class Problem3 {
    public static  String fixStart(String s){

        String  a=s.substring(0,1);

        for(int i=1; i<s.length(); i++){
            if(s.charAt(0)==s.charAt(i)){

                a=a + "*";
            }
            else{
                a=a+s.charAt(i);
            }

        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fixStart("babble"));
        System.out.println(fixStart("AmaAAn"));
    }

}
