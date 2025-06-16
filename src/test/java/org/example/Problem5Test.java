package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem5Test {

    @Test
    public void addVerbSuffixTest() {
        assertEquals("Helloworlding",Problem5.addVerbSuffix("Helloworld"));
        assertEquals("Singly",Problem5.addVerbSuffix("Sing"));
    }
}
