package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

public class Problem1Test {

    @Test
    public void donutsTest() {
        Problem1 pr = new Problem1();
        assertEquals("Number of donuts: 5", pr.donuts(5));
        assertEquals("Number of donuts: many", pr.donuts(23));

    }

    @Test
    public void donutsNegativeInput() {
        Problem1 pr = new Problem1();
        try {
            pr.donuts(-1);
            fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {

            assertEquals("Count cannot be negative", e.getMessage());
        }
    }
}
