package com.factoriaf5.rps.models;

public class Rock extends Move{

    public Rock(String name) {
        super(name);
    }

    public void Crush() {
        System.out.println("Rock crushes scissors");
    }
}
