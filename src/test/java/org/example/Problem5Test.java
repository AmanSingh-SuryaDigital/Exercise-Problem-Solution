package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem5Test {

    @Test
    public void verbingTest() {
        assertEquals("Helloworlding",Problem5.verbing("Helloworld"));
        assertEquals("Singly",Problem5.verbing("Sing"));
    }
}
