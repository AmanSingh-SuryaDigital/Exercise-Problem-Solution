package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem5Test {

    @Test
    public void addVerbSuffixTest() {
        assertEquals("Helloworlding",Problem5.addVerbSuffix("Helloworld"));
        assertEquals("SIngly",Problem5.addVerbSuffix("SIng"));
        assertEquals("Helloworld INGly",Problem5.addVerbSuffix("Helloworld ING "));
        assertEquals("Hello worldingly",Problem5.addVerbSuffix("Hello worlding "));
        assertEquals("SiNgly",Problem5.addVerbSuffix("SiNg "));
        assertEquals("Hello world in ging",Problem5.addVerbSuffix("Hello world in g"));
        assertEquals("Hello worlding",Problem5.addVerbSuffix("Hello world "));
    }
}
