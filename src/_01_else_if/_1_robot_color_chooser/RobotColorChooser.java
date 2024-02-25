
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
    	Robot rob = new Robot();
    	rob.penDown();
    	rob.setPenWidth(10);
    	
    	String input=JOptionPane.showInputDialog("what color do you want in this list. Red,Blue,Green,hot pink and navy purple");
    	 if(input.equals("red")) {
    	rob.setPenColor(100, 0, 0);
    	rob.setSpeed(1000);
    	int count = 0;
         while ( count < 4 ){
     	rob.move(300);
     	rob.turn(90);       
     	count += 1;
    	}
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

    	 



	}


		// TODO Auto-generated method stub
		
	}

