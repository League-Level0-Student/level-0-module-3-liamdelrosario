
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		int loop=0;
		for (loop=0; loop <= 10; loop+=1) {
	String Input =	JOptionPane.showInputDialog("guess any number between 1-100");
	int num = Integer.parseInt(Input);
		// 2. Print out the random variable above
		if(num==random) {
			JOptionPane.showMessageDialog(null, "correct,good, no more words");
			System.exit(0);
		}
		// 11. Repeat steps 1 to 10 ten times
		else if(num>random) {
			JOptionPane.showMessageDialog(null, "to high try again");
		}
		else if(num<random) {
			JOptionPane.showMessageDialog(null, "to low try again");
		}
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		}
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			System.out.println("you lost");
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


