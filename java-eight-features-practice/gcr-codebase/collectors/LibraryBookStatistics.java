package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {

    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}


public class LibraryBookStatistics {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Fiction", 300));
        books.add(new Book("Book B", "Fiction", 450));
        books.add(new Book("Book C", "Science", 500));
        books.add(new Book("Book D", "Science", 350));
        books.add(new Book("Book E", "History", 400));
        
        Map<String,IntSummaryStatistics> statsByGenre=
        		books.stream()
        			.collect(Collectors.groupingBy(
        					book->book.getGenre(),
        						Collectors.summarizingInt(
        								book->book.getPages()
        								)
        					
        					));
        statsByGenre.forEach((genre,stats)->{
        	
        	System.out.println("Genre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
            System.out.println();
        });
        
	}
}
