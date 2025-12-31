package constructor;

//Parent class 
class Book {

 // Public variable
 public String ISBN;

 // Protected variable
 protected String title;

 // Private variable
 private String author;

 // Constructor
 public Book(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Setter for author
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter for author
 public String getAuthor() {
     return author;
 }
}

//Child class 
public class EBook extends Book {

 private String fileFormat;

 // Constructor
 public EBook(String ISBN, String title, String author, String fileFormat) {
     super(ISBN, title, author);
     this.fileFormat = fileFormat;
 }

 // Method to demonstrate access modifiers
 public void displayDetails() {
     System.out.println("ISBN       : " + ISBN);        // public → accessible
     System.out.println("Title      : " + title);       // protected → accessible
     System.out.println("Author     : " + getAuthor()); // private → via getter
     System.out.println("Format     : " + fileFormat);
 }

 // Main method
 public static void main(String[] args) {

     EBook ebook = new EBook("978-991","Effective Java","Joshua Bloch","PDF");

     ebook.displayDetails();

     // Modify author using setter
     ebook.setAuthor("J. Bloch");
     System.out.println("Updated Author: " + ebook.getAuthor());
 }
}
