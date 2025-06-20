package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem7Test {

    @Test
    public void frontBackTest() {
       assertEquals ("abxcdy", Problem7.mergeFrontAndBackHalves("abcd","xy"));
       assertEquals ("abcdxyefgz", Problem7.mergeFrontAndBackHalves("abcdefg","xyz"));
       assertEquals ("Input length is not valid ,Length should be more than equals to 2", Problem7.mergeFrontAndBackHalves("a","z"));
       assertEquals ("axyz", Problem7.mergeFrontAndBackHalves("a","xyz"));
       assertEquals ("a x byz", Problem7.mergeFrontAndBackHalves("a b","x yz"));
       assertEquals ("a wx b yz", Problem7.mergeFrontAndBackHalves("a b ","wx yz"));

    }
}
