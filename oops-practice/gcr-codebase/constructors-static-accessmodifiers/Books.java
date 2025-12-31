package constructor;
//Class Definition

public class Books {

	//Attributes
	private String title;
	private String author;
	private double price;
	
	//Default Constructor
	Books(){
		title="Gitanjali";
		author="Rabindranath Tagore";
		price=400;
	}
	
	//Parametrized Constructor
	Books(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//Method to display book details
	public void displayDetails() {
		System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
	}
	
	public static void main(String[]args) {
		
		Books book1=new Books();
		book1.displayDetails();
		
		System.out.println();
		
		// Using parameterized constructor
        Books book2 = new Books("Clean Code", "Robert C. Martin", 450.00);
        book2.displayDetails();
	}
	
	
}
