package com.stackroute.unittest.pe3;

public class ExceptionHandling {

    public static void main(String[] arg) {
        try {
            throw new Exception("Exception occurred");
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("I was here");
        }
    }
}
