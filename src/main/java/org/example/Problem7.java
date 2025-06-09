package org.example;

public class Problem7 {

    public static String frontBack(String a, String b){

        int c = a.length()/2;
        int d= b.length()/2;

        if(a.length()%2==1){
            c=c+1;
        }
        if(b.length()%2==1){
            d=d+1;
        }
        String f1= a.substring(0,c);
        String f2= b.substring(0,d);

        String e1=a.substring(c);
        String e2=b.substring(d);

        return f1+f2+e1+e2;


    }
    public static void main(String[] args) {

        System.out.println(frontBack("abcd","xy"));
        System.out.println(frontBack("abcdefg","xyz"));
    }

}
