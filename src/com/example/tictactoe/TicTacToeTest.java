package com.example.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testWinningConditions() {
        assertEquals('X', game.getCurrentPlayer());
        assertFalse(game.checkWin());
        assertFalse(game.isBoardFull());
    }


    @Test
    public void testReset() {
        game.makeMove(0, 0);
        game.reset();
        assertEquals('X', game.getCurrentPlayer());
        assertFalse(game.checkWin());
        assertFalse(game.isBoardFull());
    }

    @Test
    public void testDraw() {
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(1, 2);
        game.makeMove(0, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 1);
        game.makeMove(2, 2);
        assertTrue(game.isBoardFull());
        assertFalse(game.checkWin());
    }
}
