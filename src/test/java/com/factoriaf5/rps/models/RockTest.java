package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RockTest {
    
    private Rock rock;

    @BeforeEach
    public void setUp() {
        rock = new Rock("Rock");
    }

    @Test
    public void testCrush() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        rock.crush();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Rock crushes scissors", result);
    
    }
}
