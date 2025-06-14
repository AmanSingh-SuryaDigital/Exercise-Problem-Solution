package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem7Test {

    @Test
    public void frontBackTest() {
       assertEquals ("abxcdy", Problem7.frontBack("abcd","xy"));
       assertEquals ("abcdxyefgz", Problem7.frontBack("abcdefg","xyz"));
    }
}
