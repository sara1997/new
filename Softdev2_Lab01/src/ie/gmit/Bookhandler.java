package ie.gmit;

public class Bookhandler {
	public static Book readBook() {
		
		Book book;
		return book;
	}

	public static void outputBook( Book book){
		System.out.println("title: "+book.title);
		System.out.println("author: "+book.author);
		System.out.println("price: "+book.price/100+"."+book.price%100);
	}
}
