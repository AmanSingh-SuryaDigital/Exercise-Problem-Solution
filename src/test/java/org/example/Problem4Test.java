package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem4Test {

    @Test
    public void swapFirstTwoCharactersTest() {
        assertEquals( "pox mid",Problem4.swapFirstTwoCharacters("mix","pod"));
        assertEquals( "Sian Amngh",Problem4.swapFirstTwoCharacters("Aman","Singh"));
    }

}