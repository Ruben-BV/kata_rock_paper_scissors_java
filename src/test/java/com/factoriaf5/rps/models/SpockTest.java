package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpockTest {
    private Spock spock;

    @BeforeEach
    public void setUp() {
        spock = new Spock("Spock");
    }

    @Test
    public void testSmashes() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        spock.smash();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Spock smashes scissors", result);
    
    }

    @Test
    public void testDecapitate() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        spock.vaporize();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Spock vaporizes rock", result);
    
    }
}
