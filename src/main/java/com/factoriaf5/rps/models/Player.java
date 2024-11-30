package com.factoriaf5.rps.models;

public class Player {
    
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeMove(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            case 4:
                return "Lizard";
            case 5:
                return "Spock";
            default:
                return "Invalid move";
        }
    }

}
