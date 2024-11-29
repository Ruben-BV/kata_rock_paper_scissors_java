package com.factoriaf5.rps.models;

import java.util.Random;

public class Computer extends Player {
    
    public Computer(String name) {
        super(name);
    }

    public String computerMove() {
        Random random = new Random();
        int computerChoice = random.nextInt(3)+1;
        return super.makeMove(computerChoice);
    }
}
