package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels removeVowels = new RemoveVowels();

    @Test
    public void removeVowels() {
        String[] arr = {"india", "germany", "united state"};
        String[] expected = {"nd", "grmny", "ntd stt"};
        assertArrayEquals(expected, removeVowels.removeVowels(arr));
    }

    @Test
    public void notNull(){
        String[] arr = {"india", "germany", "united state"};
        assertNotNull(removeVowels.removeVowels(arr));
    }
}