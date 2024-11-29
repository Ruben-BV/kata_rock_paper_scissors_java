package com.factoriaf5.rps.models;

public class Scissors extends Move{
    
    public Scissors(String name) {
        super(name);
    }

    public void cut() {
        System.out.print("Scissors cuts paper");
    }
}
