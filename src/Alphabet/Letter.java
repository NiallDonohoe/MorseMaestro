package Alphabet;
import  java.io.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class Letter {
	
	protected char character;
	private String fileLocation;
	
	public Letter(char character) {
		this.character = character;
		this.fileLocation = "C:\\Users\\Niall\\Desktop\\CS\\Projects\\MorseMaestro\\Audio files\\"+ String.valueOf(character)+ ".wav";
	}
	
	public void printCharacter() {
		System.out.println("This is letter: " + character);
	}
	
	public static void sayCharacter() {
		// to be implemented with voice recordings
	};
	
	public char getCharacter() {
		return this.character;
	}
	
	public void playCharacter() {
		try {
			File audioPath = new File(fileLocation);
			
			if(audioPath.exists()) {
				
				AudioInputStream audio = AudioSystem.getAudioInputStream(audioPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
//				long clipTimePosition = clip.getMicrosecondPosition();
//				JOptionPane.showMessageDialog(null,"Press ok to pause");
//				clip.stop();
//				
//				JOptionPane.showMessageDialog(null,"Press ok to resume");
//				clip.setMicrosecondPosition(clipTimePosition);
//				clip.start();
				
			}
			else {
				System.out.println("Can't find Audio file");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	

}
