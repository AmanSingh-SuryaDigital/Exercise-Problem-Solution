package org.example;

public class Problem4 {

    public static String mixUp(String a, String b){

        String c= b.substring(0,2)+a.substring(2);
        String d= a.substring(0,2)+b.substring(2);

        return c+ " "+d;
    }

    public static void main(String[] args) {

        System.out.println(mixUp("mix","pod"));
        System.out.println(mixUp("Aman","Singh"));


    }

}
