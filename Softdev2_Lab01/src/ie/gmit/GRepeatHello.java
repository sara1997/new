package ie.gmit;

import javax.swing.JOptionPane;

public class GRepeatHello {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("enter number"); //read

		int number= Integer.parseInt(input);// convert

		
		for (int count = 0; count< number; count++) {
			System.out.println("Hello World "+count); //+count - counting hello world
		}




	}

}
