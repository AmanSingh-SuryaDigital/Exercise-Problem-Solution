package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void creatingStringFromBothEndsTest() {
       assertEquals("Amgh" ,Problem2.getFirstAndLastTwoChars("AmanSingh"));
        assertEquals("" ,Problem2.getFirstAndLastTwoChars("a"));
        assertEquals("held" ,Problem2.getFirstAndLastTwoChars("helloWorld"));
        assertEquals("" ,Problem2.getFirstAndLastTwoChars("hel"));


    }
}
