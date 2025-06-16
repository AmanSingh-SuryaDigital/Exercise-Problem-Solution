package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem7Test {

    @Test
    public void frontBackTest() {
       assertEquals ("abxcdy", Problem7.mergeFrontAndBackHalves("abcd","xy"));
       assertEquals ("abcdxyefgz", Problem7.mergeFrontAndBackHalves("abcdefg","xyz"));
    }
}
