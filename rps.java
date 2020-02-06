// Rock Paper Scissors, made by EmiLee - 2020
import java.util.Scanner;

public class rps {
	public static void main(String args[]) {
		System.out.println("    ###############################################################");
		System.out.println("                     Welcome to Rock Paper Scissors! ");
		System.out.println("     Rock beats scissors || Paper beats Rock || Scissors beat Paper"); 
		System.out.println(" ");
		System.out.println("                                Press:       ");
		System.out.println("                              1 for Rock                      ");
		System.out.println("                              2 for Paper                     ");
		System.out.println("                              3 for scissors                  ");
//		System.out.println("     ");
//		System.out.println("                        Click anywhere to start");
		System.out.println("    ###############################################################");
		System.out.println(" ");
		System.out.println("Player 1, it's your turn!");
		
		Scanner playerOne = new Scanner(System.in);
		int pickP1 = playerOne.nextInt();
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("Player 2, pick something");
		
		Scanner playerTwo = new Scanner(System.in);
		int pickP2 = playerTwo.nextInt();
		
		System.out.println(" "); 
		
		int rock = 1, paper = 2, scissors = 3;
	
		if(pickP1 == rock) {
			if(pickP2 == rock) {
			System.out.println("Player 1 picked Rock");
			System.out.println("Player 2 picked Rock");
			System.out.println("Oh no, it'a tie :(");
		} else if(pickP2 == paper) {
			System.out.println("Player 1 picked Rock");
			System.out.println("Player 2 picked Paper");
			System.out.println("Paper beats Rock, Player 2 wins!");
		} else {
			System.out.println("Player 1 picked Rock");
			System.out.println("Player 2 picked Scissors");
			System.out.println("Rock beats Scissors, Player 1 wins!");
		}
			
		} //this is if P1 picked Rock
		
		if(pickP1 == paper) {
			if(pickP2 == rock) {
				System.out.println("Player 1 picked Paper");
				System.out.println("Player 2 picked Rock");
				System.out.println("Paper beats Rock, Player 1 wins!");
		} else if(pickP2 == paper) {
			System.out.println("Player 1 picked Paper");
			System.out.println("Player 2 picked Paper");
			System.out.println("Oh no, it's a tie :(");
		} else {
			System.out.println("Player 1 picked Paper");
			System.out.println("Player 2 picked Scissors");
			System.out.println("Scissors beat Paper, Player 2 wins!"); }
		// this is if P1 picked Paper
		
	}

		if(pickP1 == scissors) {
			if(pickP2 == rock) {
				System.out.println("Player 1 picked Scissors");
				System.out.println("Player 2 picked Rock");
				System.out.println("Rock beats Scissors, Player 2 wins!");
		} else if(pickP2 == paper) {
			System.out.println("Player 1 picked Scissors");
			System.out.println("Player 2 picked Paper");
			System.out.println("Scissors beat paper, Player 1 wins!");
		} else {
			System.out.println("Player 1 picked Scissors");
			System.out.println("Player 2 picked Scissors");
			System.out.println("Oh no, it's a tie :("); }
		// this is if P1 picked Scissors
		
		
	}
		System.out.println(" ");
		System.out.println("Thanks for playing!");
}
}
