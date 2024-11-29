package com.factoriaf5.rps.models;

public class Paper extends Move {
    
    public Paper(String name) {
        super(name);
    }

    public void cover() {
        System.out.print("Paper covers Rock");
    }
}
