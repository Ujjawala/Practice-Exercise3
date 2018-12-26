package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class MultipleException {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        try {
            int arraySize = scanner.nextInt();
            if (arraySize < 0) {
                throw new NegativeArraySizeException("Size of array cannot be negative");
            }
            if (arraySize > 100) {
                throw new IndexOutOfBoundsException("Index is out of bound");
            }
            StudentMarks studentMarks = null;
            if (studentMarks == null) {
                throw new NullPointerException("Null reference");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
