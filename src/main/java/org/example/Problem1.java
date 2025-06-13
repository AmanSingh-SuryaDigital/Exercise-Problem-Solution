package org.example;

public class Problem1 {
<<<<<<< HEAD
    public  String donuts(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
=======
    public String donuts(int count) {
>>>>>>> ae48567ee2abf36a74fb637fd7876d4f542db0aa
        if (count >= 10) {
            return "Number of donuts: many";
        } else {
            return "Number of donuts: " + count;
        }
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

<<<<<<< HEAD
        System.out.println(problem1.donuts(5));
        System.out.println(problem1.donuts(23));
        System.out.println(problem1.donuts(-2));
=======
        System.out.println(p.donuts(5));
        System.out.println(p.donuts(23));

>>>>>>> ae48567ee2abf36a74fb637fd7876d4f542db0aa
    }
}

