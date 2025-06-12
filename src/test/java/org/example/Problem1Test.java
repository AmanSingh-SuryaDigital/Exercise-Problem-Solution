package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    @Test
    public void donutsTest() {
        Problem1 pr = new Problem1();
        assertEquals("Number of donuts: 5",pr.donuts(5));
        assertEquals("Number of donuts: many",pr.donuts(23));
        assertEquals("Number of donuts: 0",pr.donuts(-1));
    }

}
