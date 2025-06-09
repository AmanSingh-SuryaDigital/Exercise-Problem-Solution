package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test {

    @Test
    public void mixUpTest() {
        assertEquals( "pox mid",Problem4.mixUp("mix","pod"));
//        System.out.println(mixUp("Aman","Singh"))
        assertEquals( "Sian Amngh",Problem4.mixUp("Aman","Singh"));
    }
}