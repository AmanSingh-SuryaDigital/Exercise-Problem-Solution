package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Problem3Test {

    @Test
    public void fixStart() {
        assertEquals("ba**le", Problem3.fixStart("babble"));
        assertEquals("Ama**n", Problem3.fixStart("AmaAAn"));
        assertNotEquals("Amaaan", Problem3.fixStart("Amaaan"));
    }

}
