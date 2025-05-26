package Advance.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();//array to store each object of book 
    int numberOfBooks = 0;//To track how many books are available
    //Construuctors to add book in library by itsname or edition or author name
    Book bookName(String name) {
        Book b = new Book(name);
        books.add(b);
        numberOfBooks++;
        return b;
    }

    Book bookName(String name, int edition) {
        Book b = new Book(name, edition);
        books.add(b);
        numberOfBooks++;
        return b;
    }

    Book bookName(String name, int edition, String authorName) {
        Book b = new Book(name, edition, authorName);
        books.add(b);
        numberOfBooks++;
        return b;
    }
    //methods for librarian use to check if book is available or not 
    boolean bookCheck(String name) {
        for (Book b : books) {
            if (b.name.equals(name)) {
                System.out.println("\n"+name+" is available in our library");
                return true;
            }
        }
        System.out.println("\n"+name+" is not available in our library");
        return false;
    }

    boolean bookCheck(String name, int edition) {
        for (Book b : books) {
            if (b.name.equals(name) && b.edition == edition) {
                System.out.println("\n"+name+" of "+edition+" edition is available in our library");
                return true;
            }
        }
        System.out.println("\n"+name+" of "+edition+" edition is not available in our library");
        return false;
    }

    boolean bookCheck(String name, int edition, String authorName) {
        for (Book b : books) {
            if (b.name.equals(name) && b.edition == edition && b.authorName.equals(authorName)) {
                System.out.println("\n"+name+" of "+edition+" edition and written by "+authorName+" is available in our library");
                return true;
            }
        }
        System.out.println("\n"+name+" of "+edition+" edition and written by "+authorName+" is not available in our library");
        return false;
    }
}
