package ie.gmit;

import javax.swing.JOptionPane;

public class Mainclass {

	public static void main(String[] args) {
		Book book = new Book("Harry does Dallas ","J K Rowling ", 20);
		
		System.out.println("title : "+book.title);
		System.out.println("Author : "+book.author);
		System.out.println("Price : "+book.price/100 +","+book.price %100);
	}

}
