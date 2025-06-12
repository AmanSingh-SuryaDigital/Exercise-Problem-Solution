package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void fixStart() {
       assertEquals( "ba**le" ,Problem3.fixStart("babble"));
        assertEquals( "Ama**n" ,Problem3.fixStart("AmaAAn"));

    }
}