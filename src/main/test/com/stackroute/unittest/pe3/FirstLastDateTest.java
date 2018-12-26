package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastDateTest {
    FirstLastDate firstLastDate = new FirstLastDate();
    @Test
    public void date() {
        assertEquals("Sun 2018-12-23\nSat 2018-12-29", firstLastDate.date());
    }
}