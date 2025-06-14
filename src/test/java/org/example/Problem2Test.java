package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void creatingStringFromBothEndsTest() {
       assertEquals("Amgh" ,Problem2.creatingStringFromBothEnds("AmanSingh"));
        assertEquals("" ,Problem2.creatingStringFromBothEnds("a"));
        assertEquals("held" ,Problem2.creatingStringFromBothEnds("helloWorld"));
        assertEquals("" ,Problem2.creatingStringFromBothEnds("hel"));


    }
}
