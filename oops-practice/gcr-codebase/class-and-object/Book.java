package oopsPractice;
//Class Definition
public class Book {

	//Attributes
	private String title;
	private String author;
	private int price;
	
	//Constructor
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//Display method
	public void display() {
		
		System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
		
	}
	
	
	public static void main(String[] args) {
		
		Book book1=new Book("2States","Chetan Bhagat",500);
		Book book2=new Book("Wings Of Fire","Abdul Kalam A.P.J",500);
		
		//calling the display method
		book1.display();
		book2.display();
		
		

	}

}
