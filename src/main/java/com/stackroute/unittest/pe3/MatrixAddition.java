package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows of matrix:");
        int row = scanner.nextInt();
        System.out.println("Input number of columns of matrix:");
        int column = scanner.nextInt();
        System.out.println(" Input elements of first matrix:");
        int[][] matrix1 = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println(" Input elements of second matrix:");
        int[][] matrix2 = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] result = matrixAddition.addMatrix(matrix1, matrix2, row, column);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] addMatrix(int[][] matrix1, int[][] matrix2, int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
