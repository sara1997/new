package ie.gmit;

import javax.swing.JOptionPane;

public class CMainClass {

	public static void main(String[] args) {
		String input;
		input = JOptionPane.showInputDialog("enter something", null);
		System.out.println("size of string is " +input.length());	
		
		int number; 
		try{
			number = Integer.parseInt(input);
		} catch(NumberFormatException nfe) {
			System.out.println("please enter a number");
			number =0; 
			
		}
		System.out.println("number multiplied by 4" +(number*4));
		

	}

}
