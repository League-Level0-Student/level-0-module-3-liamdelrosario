
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		int loop=0;
		for (loop=0; loop <= 9999; loop+=1) {
		String input = JOptionPane.showInputDialog("Say how many cats you had if you had killed cats minus one");
		int num = Integer.parseInt(input);
		if(num==3) {
			JOptionPane.showMessageDialog(null, ("crazy cat lady"));
			
		}
		if(num==2) {
			JOptionPane.showMessageDialog(null, ("Are they husband and wife?"));
			
		}
		else if(num==1) {
			JOptionPane.showMessageDialog(null, ("You are trying it out? nice"));
			
		}
		else if(num==0) {
			JOptionPane.showMessageDialog(null, ("Youre a dog person"));
			
		}
		else if(num==-1) {
			JOptionPane.showMessageDialog(null, ("took that cat biteing you to another level"));
			
		}
		else if(num==-2) {
			JOptionPane.showMessageDialog(null, ("where you in a gang fight"));
			
		}
		else if(num==-3) {
			JOptionPane.showMessageDialog(null, ("The Puston massacre"));
			
		}
		else {
			JOptionPane.showMessageDialog(null, ("No comment to much or to little or you said three instead of 3"));
		}
		
		
	}
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

