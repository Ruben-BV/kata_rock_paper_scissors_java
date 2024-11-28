package com.factoriaf5.rps.models;

public class Scissors extends Move{
    
    public Scissors(String name) {
        super(name);
    }

    public void Cut() {
        System.out.println("Scissors cuts paper");
    }
}
