package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

public class Problem1Test {

    @Test
    public void donutsTest() {
        Problem1 problem1 = new Problem1();
        assertEquals("Number of donuts: 5", problem1.donuts(5));
        assertEquals("Number of donuts: many", problem1.donuts(23));

    }

}
