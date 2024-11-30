package com.factoriaf5.rps.models;

public class Rock extends Move{

    public Rock(String name) {
        super(name);
    }

    public void crushLizard() {
        System.out.print("Rock crushes lizard");
    }

    public void crushScissors() {
        System.out.print("Rock crushes scissors");
    }
    
}
