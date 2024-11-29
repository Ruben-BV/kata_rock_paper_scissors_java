package com.factoriaf5.rps.models;

public class Human extends Player {
    
    public Human(String name) {
        super(name);
    }

    public String humanMove(int choice) {
        return super.makeMove(choice);
    }
}
