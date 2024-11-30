package com.factoriaf5.rps.models;

public class Lizard extends Move {
    public Lizard(String name) {
        super(name);
    }

    public void poison() {
        System.out.print("Lizard poisons Spock");
    }

    public void eat() {
        System.out.print("Lizard eats paper");
    }
}
