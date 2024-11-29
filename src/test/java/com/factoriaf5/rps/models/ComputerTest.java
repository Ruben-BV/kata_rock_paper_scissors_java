package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    private Computer computer;

    @BeforeEach
    public void init() {
        computer = new Computer("Computer");
    }

    @Test
    public void testComputerMove() {
        String move = computer.computerMove();
        assertTrue(move.equals("Rock") || move.equals("Paper") || move.equals("Scissors"));
    }

}
