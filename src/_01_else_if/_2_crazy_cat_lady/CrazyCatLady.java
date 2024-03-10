
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
		String poll = "https://www.youtube.com/watch?v=tPEE9ZwTmy0";
		String dong = "https://www.youtube.com/watch?v=VLVdjLbXdm4";
		String l ="https://www.youtube.com/watch?v=nyoX5ax9O1Y";
		int loop=0;
		for (loop=0; loop <= 9999; loop+=1) {
		String input = JOptionPane.showInputDialog("Say how many cats you had if you had killed cats minus one each");
		int num = Integer.parseInt(input);
		if(num>=3) {
			JOptionPane.showMessageDialog(null, ("crazy cat lady"));
			
		}
		if(num==1||num==2) {
			JOptionPane.showMessageDialog(null,"trying it");
			playVideo(poll);
			
		}
		
		else if(num==0) {
			JOptionPane.showMessageDialog(null, ("Youre a dog person"));
			playVideo(dong);
			
		}

		else if(num<0) {
			JOptionPane.showMessageDialog(null, ("The Puston massacre"));
			playVideo(l);
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
