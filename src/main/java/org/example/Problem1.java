package org.example;

public class Problem1 {

    public  String donuts(int count) {
        if (count >= 10) {
            return "Number of donuts: many";
        } else {
            return "Number of donuts: " + count;
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();

        System.out.println(p.donuts(5));
        System.out.println(p.donuts(23));
    }
}

