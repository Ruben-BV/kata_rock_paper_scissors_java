package com.factoriaf5.rps.models;

public class Spock extends Move {
    
    public Spock(String name) {
        super(name);
    }

    public void smash() {
        System.out.print("Spock smashes scissors");
    }

    public void vaporize() {
        System.out.print("Spock vaporizes rock");
    }

}
