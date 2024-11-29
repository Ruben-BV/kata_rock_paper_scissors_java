package com.factoriaf5.rps.models;

public class Rock extends Move{

    public Rock(String name) {
        super(name);
    }

    public void crush() {
        System.out.println("Rock crushes scissors");
    }
}
