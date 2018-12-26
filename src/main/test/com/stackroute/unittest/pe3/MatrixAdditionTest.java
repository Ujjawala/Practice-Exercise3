package com.stackroute.unittest.pe3;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition = new MatrixAddition();

    @Test
    public void sumOfMatrix() {
        int[][] matrix1 = {{2, 4}, {5, 7}};
        int[][] matrix2 = {{5, 9}, {3, 8}};
        int[][] expected = {{7, 13}, {8, 15}};
        Assert.assertArrayEquals(expected, matrixAddition.addMatrix(matrix1, matrix2, 2, 2));
    }
}
