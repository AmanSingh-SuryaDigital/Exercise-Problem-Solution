package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void replaceNotBadWithGoodTest() {

        assertEquals("This dinner is good!", Problem6.replaceNotBadWithGood("This dinner is not that bad!"));
        assertEquals("The movie is good.", Problem6.replaceNotBadWithGood("The movie is not so bad."));
        assertEquals("The movie is so good.", Problem6.replaceNotBadWithGood("The movie is so good."));
        assertEquals("The bad is not so.", Problem6.replaceNotBadWithGood("The bad is not so."));
        assertEquals("The dinner is bad", Problem6.replaceNotBadWithGood("The dinner is bad"));
        assertEquals("This is movie", Problem6.replaceNotBadWithGood("This is movie"));

    }
}
