package Alphabet;

import java.util.ArrayList;
import java.util.Random;



public class Alphabet {
	
	private static ArrayList<Letter> alphabet = new ArrayList<Letter>();
	private static ArrayList<Letter> randomCharacterSequence = new ArrayList<Letter>();
	
	public static void createAlphabet() {
		for(int asciiValue = 65; asciiValue<=90; asciiValue++) {
			alphabet.add(new Letter((char)asciiValue));
		}
	}
	
	public static ArrayList<Letter> getRandomCharacterSequence(int gameLength){
		for(int i = 0; i<gameLength; i++) {
			randomCharacterSequence.add(alphabet.get(new Random().nextInt(alphabet.size())));
		}
		return randomCharacterSequence;
	}

}
