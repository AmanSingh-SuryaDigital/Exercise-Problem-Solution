package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

public class Problem1Test {

    @Test
    public void donutsTest() {
<<<<<<< HEAD
        Problem1 problem1 = new Problem1();
        assertEquals("Number of donuts: 5", problem1.donuts(5));
        assertEquals("Number of donuts: many", problem1.donuts(23));

=======
        Problem1 pr = new Problem1();

        assertEquals("Number of donuts: 5",pr.donuts(5));
        assertEquals("Number of donuts: many",pr.donuts(23));
        assertEquals("Number of donuts: 0",pr.donuts(-1));
>>>>>>> ae48567ee2abf36a74fb637fd7876d4f542db0aa
    }

}
