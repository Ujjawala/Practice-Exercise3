package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private StudentMarks studentMarks = new StudentMarks();
    @Test
    public void average() {
        String expected = "The average is 81.5";
        int[] grades = {86, 65, 98, 77};
        String actual = studentMarks.average(grades);
        assertEquals(expected, actual);

    }

    @Test
    public void minimum() {
        String expected = "The minimum is 65";
        int[] grades = {86, 65, 98, 77};
        String actual = studentMarks.minimum(grades);
        assertEquals(expected, actual);
    }

    @Test
    public void maximum() {
        String expected = "The maximum is 98";
        int[] grades = {86, 65, 98, 77};
        String actual = studentMarks.maximum(grades);
        assertEquals(expected, actual);
    }
}