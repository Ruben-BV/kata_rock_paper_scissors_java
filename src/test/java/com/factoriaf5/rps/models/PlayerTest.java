package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Lennon");
    }

    @Test
    public void testSetAndGetName() {
        
        player.setName("Jhon");
        String result = player.getName();
        assertEquals("Jhon", result);
    }
    
    @Test
    public void testHumanMoveRock() {
        int choice = 1;
        String result = player.makeMove(choice);
        assertEquals("Rock", result);
    }

    @Test
    public void testHumanMovePaper() {
        int choice = 2;
        String result = player.makeMove(choice);
        assertEquals("Paper", result);
    }

    @Test
    public void testHumanMoveScissors() {
        int choice = 4;
        String result = player.makeMove(choice);
        assertEquals("Invalid move", result);
    }
}
