package Demo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import Alphabet.Alphabet;
import Alphabet.Letter;

public class gameRunner {
	
	private static int correct = 0;	
	private static int wrong = 0;
	private static int gameLength = 1; // number of characters
	private static ArrayList<Letter> randomCharacterSequence = new ArrayList<Letter>();
	
	protected static void playGame() {
		
		System.out.println("Welcome to Morse Maestro");
		JOptionPane.showMessageDialog(null,"Press ok start game");
		Alphabet.createAlphabet();
		randomCharacterSequence  = Alphabet.getRandomCharacterSequence(gameLength);
		
		for(Letter L: randomCharacterSequence) {
			L.playCharacter();
			Scanner sc = new Scanner(System.in);  
	        // Character input
	        char guess = sc.next().charAt(0);
	   
	        // Print the read value
	        System.out.println("c = "+guess);
			 
			 handleGuess(guess,L.getCharacter());

		}
		
	}
	
	public static void handleGuess(char Guess, char L) {
		if(Character.compare(Guess, L)==0) {
			System.out.println("Correct!");
			correct++;
		}
		else {
			System.out.println("Oops!");
			wrong++;
		}
		
	}
}
