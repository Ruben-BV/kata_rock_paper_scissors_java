package com.factoriaf5.rps.application;

import java.util.Scanner;

import com.factoriaf5.rps.models.Computer;
import com.factoriaf5.rps.models.Human;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {
    public String chooseOpponent() {
        System.out.println("Choose your opponent: 1 for 'Computer', 2 for 'Player2'");
        Scanner scanner = new Scanner(System.in);
        int opponentChoice = scanner.nextInt();
        
        switch (opponentChoice) {
            case 1:
                return "Computer";
            case 2:
                return "Human";
            default:
                return "Invalid choice. Please choose 1 for Computer or 2 for Human.";
        }
    
    }

    public String[] Moves() {
        String[] moves = new String[2];
        
        System.out.println("Choose your move: 1 for 'Rock', 2 for 'Paper', 3 for 'Scissors'");
        Scanner scanner = new Scanner(System.in);
        int player1Choice = scanner.nextInt();
        Human player1 = new Human("Player1");
        String player1Move = player1.humanMove(player1Choice);
        moves[0] = player1Move;
        
        
        if (chooseOpponent().equals("Human")) {
            System.out.println("The opponent choose the move: 1 for 'Rock', 2 for 'Paper', 3 for 'Scissors'");
            int player2Choice = scanner.nextInt();
            Human player2 = new Human("Player2");
            moves[1] = player2.humanMove(player2Choice);
        }
        else {
            Computer player2 = new Computer("Player2");
            moves[1] = player2.computerMove();
        }
        
        return moves;
    }


    public void chooseWinner(String[] moves) {
        if (moves[0].equals(moves[1])) {
            System.out.print(moves[0] + " vs " + moves[1] + "\nIt's a tie!");
        }
        else if (moves[0].equals("Rock") && moves[1].equals("Paper")){
            Paper paper = new Paper("paper");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer2 wins to Player1! - ");
            paper.cover();
        }
        else if (moves[0].equals("Rock") && moves[1].equals("Scissors")){
            Rock rock = new Rock("rock");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer1 wins to Player2! - ");
            rock.crush();
        }
        else if (moves[0].equals("Paper") && moves[1].equals("Rock")){
            Paper paper = new Paper("paper");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer1 wins to Player2! - ");
            paper.cover();
        }
        else if (moves[0].equals("Paper") && moves[1].equals("Scissors")){
            Scissors scissors = new Scissors("scissors");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer2 wins to Player1! - ");
            scissors.cut();
        }
        else if (moves[0].equals("Scissors") && moves[1].equals("Rock")){
            Rock rock = new Rock("rock");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer2 wins to Player1! - ");
            rock.crush();
        }
        else if (moves[0].equals("Scissors") && moves[1].equals("Paper")){
            Scissors scissors = new Scissors("scissors");
            System.out.print(moves[0] + " vs " + moves[1] + "\nPlayer1 wins to Player2! - ");
            scissors.cut();
        }
    }
}

