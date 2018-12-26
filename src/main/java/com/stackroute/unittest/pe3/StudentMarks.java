package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int noOfStudent = scanner.nextInt();
        int[] grades = new int[noOfStudent];
        for (int i = 0; i < noOfStudent; i++){
            System.out.println("Enter the grade for student " + i+1 + ": ");
            grades[i] = scanner.nextInt();
            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Wrong grade");
                break;
            }
        }
        StudentMarks studentMarks = new StudentMarks();
        System.out.println(studentMarks.average(grades));
        System.out.println(studentMarks.minimum(grades));
        System.out.println(studentMarks.maximum(grades));
    }
    public String average(int[] grades){
        double avg = 0;
        for (int i = 0; i < grades.length; i++){
            avg += grades[i];
        }
        return "The average is " + avg/grades.length;
    }
    public String minimum(int[] grades){
        int min = 100;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < min) min = grades[i];
        }
        return "The minimum is " + min;
    }
    public String maximum(int[] grades){
        int max = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max) max = grades[i];
        }
        return "The maximum is " + max;
    }
}