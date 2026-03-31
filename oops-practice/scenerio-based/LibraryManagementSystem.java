package scenerioBased2;

//Create LibraryManagementSystem class to search book and Checkout
import java.util.Scanner;
public class LibraryManagementSystem {

	
	//Create a 2d array to store book details
	 static String[][]bookDetails=new String[5][3]; 
	 
	public static void main(String[] args) {
	
		//Create Scanner object to input from the keyboard
		Scanner input=new Scanner(System.in);
		
		
		//Take input from the user for 5 books
		for(int book=0;book<bookDetails.length;book++) {
			
			//display message
			System.out.println("Enter book details for book "+(book+1)+" as title,author and status");
			
			for(int index=0;index<bookDetails[0].length;index++) {
				
				bookDetails[book][index]=input.nextLine();
			}
		}
		
		//Display all books
		displayBooks();
		
		//Take input for searching book by title
		System.out.println("Enter the title you want to search: ");
		String title=input.nextLine();
		
		//call the method to searching
		searchingBook(title);
		
		//Checkout method
		System.out.println("Enter the title you want to checkout ");
		String checkoutTitle=input.nextLine();
		//Call method checkout
		checkingOut(checkoutTitle);
		
		//Close Scanner
		input.close();
		
	}
	
	//Display Method
	public static void displayBooks() {
		
		for(int book=0;book<bookDetails.length;book++) {
			
			System.out.println("Details of Book "+(book+1));
			System.out.println("Title: "+bookDetails[book][0]);
			System.out.println("Author: "+bookDetails[book][1]);
			System.out.println("Status: "+bookDetails[book][2]);
		}
		
	}
	
	//Searching Method
	public static void searchingBook(String title) {
		
		title=title.toLowerCase();
		boolean isFound=false;
		
		//Loop to find the book
		for(int book=0;book<bookDetails.length;book++) {
			
			if(bookDetails[book][0].toLowerCase().contains(title)) {
				
				System.out.println("Book Found: ");
				System.out.println("Details of Book "+(book+1));
				System.out.println("Title: "+bookDetails[book][0]);
				System.out.println("Author: "+bookDetails[book][1]);
				System.out.println("Status: "+bookDetails[book][2]);
				isFound=true;
				
			}
				
		}
		if(!isFound) {
			System.out.println("Book Not Found");
		}

	}
	
	//checking out method
	public static void checkingOut(String title) {
		
		title=title.toLowerCase();
		
		for(int book=0;book<bookDetails.length;book++) {
			
			if(bookDetails[book][0].toLowerCase().equals(title)) {
				
				if(bookDetails[book][2].equalsIgnoreCase("Available")) {
					
					bookDetails[book][2]="Checked Out";
					System.out.println("Book is Successfully Checked out");
					
					
				}else {
					System.out.println("Book already Checked Out");
				}
				return;
			}
		}
		System.out.println("Not Found");
	}
	
}
