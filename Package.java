package playGame;

import java.util.Scanner;
public class Package {
	public static void main (String[] args) {
		
		
		
		System.out.print("This emulates a guessing game.\nThe computer will pick a number and you'll have to guess it.");
		System.out.println();
		
		

		
			
			
			playGame();
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void playGame() {
		
		int i;
		Scanner scan = new Scanner (System.in);
		int computerGuess;
		computerGuess = (int)(Math.random()*6)+1;
		int guessCount = 0;
		System.out.print("Enter your first guess: ");
		while (true) {
			i = scan.nextInt();
			
			guessCount++;
			
			if (computerGuess == i) {
				System.out.println("Yay! You guessed right in " + guessCount + " times.");
				System.out.println("The computer's pick was " + computerGuess);
				break;
			}
			if (guessCount == 6) {
				System.out.println("Mission failed.");
				System.out.println("You've reached the limited number of guess time");
				break;
			}
			if (i < computerGuess) {
				System.out.print("That's quite low mate. Guess again: ");
			}
			else if (i > computerGuess) {
				System.out.print("That's quite high mate. Guess again: ");
			}
				
			
			
		}
	}
	 

}
