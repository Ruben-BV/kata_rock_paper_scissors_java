package com.factoriaf5.rps.factory;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Move;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class MoveFactory {
    public Move createMove(int choice) {
        switch (choice) {
            case 1:
                return new Rock("Rock");
            case 2:
                return new Paper("Paper");
            case 3:
                return new Scissors("Scissors");
            case 4:
                return new Lizard("Lizard");
            case 5:
                return new Spock("Spock");
            default:
                return null;
        }
    }
}
