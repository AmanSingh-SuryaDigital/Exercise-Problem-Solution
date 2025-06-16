package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem3Test {

    @Test
    public void fixStartTest() {
        assertEquals("ba**le", Problem3.replaceRepeatedFirstChar("babble"));
        assertEquals("Ama**n", Problem3.replaceRepeatedFirstChar("AmaAAn"));
    }
}
