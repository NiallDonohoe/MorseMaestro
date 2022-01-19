package Alphabet;
import  java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public abstract class Letter {
	
	protected static String character;
	private static String fileLocation = "C:\\Users\\Niall\\Desktop\\CS\\Projects\\MorseMaestro\\Audio files\\" + "MORSE" + ".wav";
	
	public void printCharacter() {
		System.out.println("This is letter: " + character);
	}
	
	public static void sayCharacter() {
		// to be implemented with voice recordings
	};
	
	public static void playCharacter() {
		System.out.println(fileLocation);
		try {
			File audioPath = new File(fileLocation);
			
			if(audioPath.exists()) {
				
				AudioInputStream audio = AudioSystem.getAudioInputStream(audioPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
				long clipTimePosition = clip.getMicrosecondPosition();
				JOptionPane.showMessageDialog(null,"Press ok to Pause");
				clip.stop();
				
				JOptionPane.showMessageDialog(null,"Press ok to Play");
				clip.setMicrosecondPosition(clipTimePosition);
				clip.start();
				
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
