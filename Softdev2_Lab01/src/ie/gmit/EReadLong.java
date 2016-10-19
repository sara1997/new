package ie.gmit;

import javax.swing.JOptionPane;

public class EReadLong {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("enter long"); ///convert 
		
		long lg; // variable 
		lg = Long.parseLong(input);
		System.out.println("divides by 7 = "+ (lg/7));

	}

}
