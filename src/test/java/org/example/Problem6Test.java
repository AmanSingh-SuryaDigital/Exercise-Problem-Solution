package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void replaceNotBadWithGoodTest() {

        assertEquals("This dinner is good!", Problem6.replaceNotBadWithGood("This dinner is not that bad!"));
        assertEquals("The movie is good.", Problem6.replaceNotBadWithGood("The movie is not so bad."));
    }
}
