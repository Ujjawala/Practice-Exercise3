package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] arg) {
        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard.print());
    }
    public String print() {
        String string = "";
        for (int i = 0; i < 8; i++){
            if (i % 2 == 0) {
                string = string + "WW|BB|WW|BB|WW|BB|WW|BB|";
            } else {
                string = string + "BB|WW|BB|WW|BB|WW|BB|WW|";
            }
            string = string + "\n";
        }
        return string;
    }
}
