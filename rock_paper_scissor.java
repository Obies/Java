package rockPaperScissorGame;
//import Scanner to receive input from the user
import java.util.Scanner;
import java.util.Random;   

public class rock_paper_scissor {
	public static void main(String[] args) {
		// Get input from the user
		Random random = new Random();   
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer of your respective choice: (1)Rock, (2)Paper, (0)Scissors:"); 
		int myMove = in.nextInt();
		
		//Verify that myMove is valid
		if (myMove != 0 && myMove != 1 && myMove != 2) {
			System.out.println("You selected an invalid option champ");
		} 
		else{
			int opponentMove = random.nextInt(3);  
			System.out.println("OpponentMove: " + opponentMove);
			if (myMove == opponentMove) {
				System.out.println("You both tied!");
			} 
			if ((myMove == 0 && opponentMove == 2) || (myMove == 1 && opponentMove == 0) || (myMove == 2 && opponentMove == 1)) {
				System.out.println("You won!");
			} 
			else {
				System.out.println("You lost this one!");
			}
		}
		
	}
}