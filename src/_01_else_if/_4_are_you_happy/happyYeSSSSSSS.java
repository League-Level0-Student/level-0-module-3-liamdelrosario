package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happyYeSSSSSSS {

	public happyYeSSSSSSS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String depe=	JOptionPane.showInputDialog("Are you happy yes or no");
	if (depe.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Do not do anything dangrous hopefully you will not die right???????????");
	}
	else if(depe.equals("no")) {
	String lol=JOptionPane.showInputDialog("Are you going to get better yes or no?");
	
	if(lol.equals("yes")) {
		JOptionPane.showMessageDialog(null, "hope you get better");
	}
		else if(lol.equals("no")) {
		JOptionPane.showMessageDialog(null, "Hey guys I guess thats it");	
		}
	
	}
	else {
		JOptionPane.showMessageDialog(null, "what the, what the , what the what are even talking about");
	}
	}

}
