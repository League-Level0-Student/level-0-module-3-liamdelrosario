
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
    	rob.setSpeed(200);
    	
       int loop=0;
       for (loop=0; loop < 9999; loop+=1) {
		int count =0;
		
    	String input = JOptionPane.showInputDialog("what color do you want in this list.Red,Blue,Green,hot pink and navy purple");
    	 if(input.equals("red")) {
    		rob.setPenColor(170,10,10);
    		 while ( count <4 ){
    		    	rob.move(100);
    			 rob.turn(90);
    			 count += 1;
    		 
    			
    		 }
    	}
    	 else if(input.equals("blue")) {
    		 rob.setPenColor(0,0,160);
    		 while ( count < 5 ){
    			 rob.move(89);
    			 rob.turn(72);
    			 count += 1;
    		 }
    	 }  
    	 else if (input.equals("green")){ 
    		 rob.setPenColor(10,160,0);
    		 while ( count <10 ){
    			 rob.move(70);
    			 rob.turn(36);
    			 count += 1;
    		 }
    	 }
    	 else if (input.equals("hot pink")){
     		 rob.setPenColor(160,30,15);
     		 while ( count < 10 ){
     			 rob.move(70);
     			 rob.turn(36);
     			 count += 1;
     		 }
     	 }
    	 else if(input.equals("navy purple")) {
     		 rob.setPenColor(160,1,160);
     		 while ( count < 12 ){
     			 rob.move(70);
     			 rob.turn(30);
     			 count += 1;
     		 }
     	 } else  {
     		rob.setRandomPenColor();
    		 while ( count < 12 ){
    			 rob.move(70);
    			 rob.turn(30);
    			 count += 1;
     	 }
     	 }
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

