package ie.gmit;

import javax.swing.JOptionPane;

public class FReadBoolean {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("enter boolean"); //read

		boolean printYes = Boolean.parseBoolean(input);//convert
		if (printYes == true) {// if true
			System.out.println("yes");
		}
		else{// if false
			System.out.println("no");
		}
	}

}


