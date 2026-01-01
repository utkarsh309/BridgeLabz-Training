package keywords;

//Create a Book class to manage library books
public class Book {

	//Static Variable
	private static String libraryName="Gla Library";
	
	//Instance Variable
	private String title;
	private String author;
	
	
	private final String isbn; //final variable
	
	
	//Constructor
	public Book(String title,String author,String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	//Static method to get the name of library
	public static void getLibraryName() {
		System.out.println("Library Name : "+libraryName);
	}
	
	//Method to display book details
	public void displayBookDetails() {
		//Using instanceof to check if the object is a Book instance
		if(this instanceof Book) {
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Isbn: "+isbn);
			
		}else {
			System.out.println("Invalid instance ");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Book book1=new Book("Effective Java","Joshua Bloch","978-0134685991");
		Book.getLibraryName();
		book1.displayBookDetails();

	}

}
