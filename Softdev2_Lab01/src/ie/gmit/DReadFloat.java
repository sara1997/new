package ie.gmit;

import javax.swing.JOptionPane;

public class DReadFloat {
	public static void main (String[] args) {
		String input=JOptionPane.showInputDialog("enter fl"); ///convert 
		
		
			
		float fl;
		fl = Float.parseFloat(input);
		System.out.println("multiplied by 100 "+(fl*1000));
	}
	
}