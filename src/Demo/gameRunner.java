package Demo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import Alphabet.Alphabet;
import Alphabet.Letter;

public class gameRunner {
	
	private static int correct = 0;	
	private static int wrong = 0;
	private static int gameLength = 10; // number of characters
	private static ArrayList<Letter> randomCharacterSequence = new ArrayList<Letter>();
	
	protected static void playGame() {
		
		System.out.println("Welcome to Morse Maestro");
		JOptionPane.showMessageDialog(null,"Press ok start game");
		Alphabet.createAlphabet();
		randomCharacterSequence  = Alphabet.getRandomCharacterSequence(gameLength);
		
		for(Letter L: randomCharacterSequence) {
			handleCharacterPlaying(L);
		}
		showResults();
	}
	
	public static void handleCharacterPlaying(Letter L) {
		System.out.println("What is this character???");
		
		L.playCharacter();
		Scanner sc = new Scanner(System.in);  
        char guess = sc.next().charAt(0);
		handleGuess(guess,L.getCharacter());
		
	}
	
	public static void handleGuess(char Guess, char L) {
		if(Character.compare(Guess, L)==0) {
			System.out.println("Correct!, the letter is "+Guess);
			correct++;
		}
		else {
			System.out.println("Oops!, the letter is "+L+" not "+Guess);
			wrong++;
		}
		
	}
	
	public static void showResults() {
		System.out.println("Not too bad!!!");
		System.out.println("Correct: "+correct);
		System.out.println("Wrong: "+wrong);
		System.out.println("Accuracy: "+ (double) (correct*100)/(correct+wrong)+ "%");		
	}
}
