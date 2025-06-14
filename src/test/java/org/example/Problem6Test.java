package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void notbadTest() {

        assertEquals("This dinner is good!", Problem6.notbad("This dinner is not that bad!"));
        assertEquals("The movie is good.", Problem6.notbad("The movie is not so bad."));
    }
}
