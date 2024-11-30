package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LizardTest {
    private Lizard lizard;

    @BeforeEach
    public void setUp() {
        lizard = new Lizard("Lizard");
    }

    @Test
    public void testPoison() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        lizard.poison();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Lizard poisons Spock", result);
    
    }

    @Test
    public void testeat() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        lizard.eat();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Lizard eats paper", result);
    
    }
}
