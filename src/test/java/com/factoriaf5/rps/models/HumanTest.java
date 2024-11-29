package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HumanTest {
    private Human human;

    @BeforeEach
    public void setUp() {
        human = new Human("Lennon");
    }

    @Test
    public void testHumanMove() {
        int choice = 1;
        String result = human.humanMove(choice);
        assertEquals("Rock", result);
    }

}
