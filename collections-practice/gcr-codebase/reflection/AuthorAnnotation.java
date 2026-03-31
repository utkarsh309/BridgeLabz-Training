package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Create annotation
@Retention(RetentionPolicy.RUNTIME)   // needed for reflection
@interface Author {
    String name();
}

// Apply annotation to a class
@Author(name = "Author Name")
class Book {
    public void read() {
        System.out.println("Reading book...");
    }
}

// Retrieve annotation using Reflection
public class AuthorAnnotation {

    public static void main(String[] args) {

        // Get Class object
        Class<Book> cls = Book.class;

        // Get Author annotation
        Author author = cls.getAnnotation(Author.class);

        // Print annotation value
        if (author != null) {
            System.out.println("Author Name: " + author.name());
        }
    }
    
}
