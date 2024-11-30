package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaperTest {
    private Paper paper;

    @BeforeEach
    public void setUp() {
        paper = new Paper("Paper");
    }

    @Test
    public void testCover() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        paper.cover();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Paper covers Rock", result);
    
    }

    @Test
    public void testDisprove() {
        
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        paper.disprove();

        System.setOut(System.out);
        String result = outputStream.toString();
        assertEquals("Paper disproves Spock", result);
    
    }
}
