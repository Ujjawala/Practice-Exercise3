package com.stackroute.unittest.pe3;

import junit.framework.Assert;
import org.junit.Test;

public class ChessBoardTest {
    private ChessBoard chessBoard = new ChessBoard();
    @Test
    public void check() {
        Assert.assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\n", chessBoard.print());
    }
    @Test
    public void checkFailure() {
        Assert.assertNotSame("WW|BB|WW|BB|WW|BB|WW|BB|BB|WW|BB|WW|BB|WW|BB|WW|WW|BB|WW|BB|WW|BB|WW|BB|BB|WW|BB|WW|BB|WW|BB|WW|WW|BB|WW|BB|WW|BB|WW|BB|BB|WW|BB|WW|BB|WW|BB|WW|WW|BB|WW|BB|WW|BB|WW|BB|BB|WW|BB|WW|BB|WW|BB|WW|", chessBoard.print());
    }
}
