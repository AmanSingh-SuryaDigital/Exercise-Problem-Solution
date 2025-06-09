package org.example;

public class Problem6 {

    public static String notbad(String s){

        int a=s.indexOf("not");
        int b=s.indexOf("bad");
        String str="";

        if(b>a){
          str=   s.replace(s.substring(a,b+3),"good");
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(notbad("This dinner is not that bad!"));
    }

}
