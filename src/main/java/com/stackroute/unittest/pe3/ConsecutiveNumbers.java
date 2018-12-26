package com.stackroute.unittest.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String[] temp = scanner.nextLine().split(",");
        int[] input = new int[temp.length];
        for (int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(temp[i]);
        }
        ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
        System.out.println(consecutiveNumbers.check(input));
    }
    public String check(int[] input) {
        Arrays.sort(input);
        boolean flag = true;
        for (int i = 0; i < input.length-1; i++){
            if ((input[i+1] - input[i]) != 1) {
                flag = false;
                break;
            }
        }
        if (flag == true){
            return "Consecutive numbers";
        } else {
            return "non Consecutive numbers";
        }
    }
}
