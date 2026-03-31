package Inheritance;

//Class definition
class Book{
	
	//Attributes
	protected String title;
	protected int publicationYear;
	
	//Constructor
	Book(String title,int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
}

//Class Definition
class Author extends Book{
	
	//Attributes
	private String name;
	private String bio;
	
	//Constructor
	Author(String title,int publicationYear,String name,String bio){
		super(title,publicationYear);//Call parent constructor
		this.name=name;
		this.bio=bio;
	}
	
	//display method
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Publication Year: "+publicationYear);
		System.out.println("Name: "+name);
		System.out.println("Bio: "+bio);
	}
}


public class Library {

	public static void main(String[] args) {
		
		Author author1=new Author("2States",2000,"Chetan Bhagat","Writer");
		
		//Call display method
		author1.displayInfo();

	}

}
