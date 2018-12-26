package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String[] places = new String[len];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < len; i++){
            places[i] = scanner1.nextLine();
        }
        RemoveVowels removeVowels = new RemoveVowels();
        removeVowels.removeVowels(places);
        for (int i = 0; i < places.length; i++){
            System.out.println("Place Name without Vowels:" + i + " " + places[i]);
        }
    }
    public String[] removeVowels(String[] places) {
        for (int i = 0; i < places.length; i++){
            String temp = places[i].replaceAll("a|e|i|o|u", "");
            places[i] = temp;
        }
        return places;
    }
}
