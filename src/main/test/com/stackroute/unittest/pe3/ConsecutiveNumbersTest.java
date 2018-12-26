package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
    @Test
    public void consecutive() {
       int[] arr = {98,96,95,94,93};
       assertEquals("non Consecutive numbers", consecutiveNumbers.check(arr));
    }

    @Test
    public void nonConsecutive() {
        int[] arr = {54,53,52,51,50,49,48};
        assertEquals("Consecutive numbers", consecutiveNumbers.check(arr));
    }
}