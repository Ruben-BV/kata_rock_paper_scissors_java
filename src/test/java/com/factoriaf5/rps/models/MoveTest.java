package com.factoriaf5.rps.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MoveTest {
    private Move move;

    @BeforeEach
    public void init() {
        move = new Move("move");
    }

    @Test
    public void testGetName() {
        
        move.setName("move");
        String result = move.getName();
        assertEquals("move", result);
    }
}
