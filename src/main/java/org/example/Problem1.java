package org.example;

public class Problem1 {
    public  String donuts(int count) {


    public String donuts(int count) {
        if (count >= 10) {
            return "Number of donuts: many";
        } else {
            return "Number of donuts: " + count;
        }
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        System.out.println(problem1.donuts(5));
        System.out.println(problem1.donuts(23));
        System.out.println(problem1.donuts(-2));


    }
}

