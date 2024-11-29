package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScissorsTest {
    private Scissors scissors;

    @BeforeEach
    public void setUp() {
        scissors = new Scissors("Scissors");
    }

    @Test
    public void testCrush() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        scissors.cut();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Scissors cuts paper", result);
    
    }
}
