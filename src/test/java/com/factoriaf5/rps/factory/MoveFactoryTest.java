package com.factoriaf5.rps.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class MoveFactoryTest {
        private MoveFactory moveFactory;

        @BeforeEach
        public void setUp() {
            moveFactory = new MoveFactory();
        }
    
        @Test
        public void testCreateMoveRock() {
        Move move = moveFactory.createMove(1);
        assertTrue(move instanceof Rock);
        }

        @Test
        public void testCreateMovePaper() {
        Move move = moveFactory.createMove(2);
        assertTrue(move instanceof Paper);
        }

        @Test
        public void testCreateMoveScissors() {
        Move move = moveFactory.createMove(3);
        assertTrue(move instanceof Scissors);
        }

        @Test
        public void testCreateMoveLizard() {
        Move move = moveFactory.createMove(4);
        assertTrue(move instanceof Lizard);
        }

        @Test
        public void testCreateMoveSpock() {
        Move move = moveFactory.createMove(5);
        assertTrue(move instanceof Spock);
        }

        @Test
        public void testCreateMoveInvalid() {
        Move move = moveFactory.createMove(6);
        assertNull(move);
    }
}
