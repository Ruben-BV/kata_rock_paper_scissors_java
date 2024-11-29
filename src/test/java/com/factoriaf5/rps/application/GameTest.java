package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testChooseOpponentComputer() {
        String simulatedInput = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        Game game = new Game();
        String result = game.chooseOpponent();
        
        assertEquals("Computer", result);
    }

    @Test
    public void testChooseOpponentHuman() {
        String simulatedInput = "2\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        Game game = new Game();
        String result = game.chooseOpponent();
        
        assertEquals("Human", result);
    }

    @Test
    public void testChooseOpponentInvalidChoice() {
        String simulatedInput = "5\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        Game game = new Game();
        String result = game.chooseOpponent();
        
        assertEquals("Invalid choice. Please choose 1 for Computer or 2 for Human.", result);
    }

    @Test
    public void testChooseWinnerTie () {
        String[] moves = {"Rock", "Rock"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Rock vs Rock\nIt's a tie!", outputStream.toString());
    }

    @Test
    public void testChooseWinnerRockPaper () {
        String[] moves = {"Rock", "Paper"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Rock vs Paper\nPlayer2 wins to Player1! - Paper covers Rock", outputStream.toString());
    }

    @Test
    public void testChooseWinnerRockScissors () {
        String[] moves = {"Rock", "Scissors"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Rock vs Scissors\nPlayer1 wins to Player2! - Rock crushes scissors", outputStream.toString());
    }

    @Test
    public void testChooseWinnerPaperRock () {
        String[] moves = {"Paper", "Rock"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Paper vs Rock\nPlayer1 wins to Player2! - Paper covers Rock", outputStream.toString());
    }

    @Test
    public void testChooseWinnerPaperScissors () {
        String[] moves = {"Paper", "Scissors"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Paper vs Scissors\nPlayer2 wins to Player1! - Scissors cuts paper", outputStream.toString());
    }

    @Test
    public void testChooseWinnerScissorsRock () {
        String[] moves = {"Scissors", "Rock"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Scissors vs Rock\nPlayer2 wins to Player1! - Rock crushes scissors", outputStream.toString());
    }

    @Test
    public void testChooseWinnerScissorsPaper () {
        String[] moves = {"Scissors", "Paper"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        game.chooseWinner(moves);
        
        assertEquals("Scissors vs Paper\nPlayer1 wins to Player2! - Scissors cuts paper", outputStream.toString());
    }
}
