/*Aggregation ("Has-a" Relationship with Independence) :-
Definition: Aggregation is a special type of association where one class contains another class, but both can exist independently.

Real-Life Example:

A Library has Books, but books can exist even without a library. 
The Library contains Books, but if the Library is deleted, the Books can still exist.
*/

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
}

class Library {
    String name;
    List<Book> books; // Library has books

    Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Data Structures");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        Library library = new Library("City Library", bookList);
        System.out.println(library.name + " has " + library.books.size() + " books.");
    }
}



/*Summary Table

 Concept	       Relationship Type	        Dependency	                            Example

 Association	     "Uses-a"	               No Dependency	                     Teacher - Student
Aggregation	       "Has-a" (Weak)	       Can exist independently	                 Library - Books
Composition	       "Has-a" (Strong)	       Cannot exist independently	             Human - Heart */