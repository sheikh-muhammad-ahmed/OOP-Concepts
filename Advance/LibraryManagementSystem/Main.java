package Advance.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library lib=new Library();//library object to access book from main
        //Adding book in library using Book object by calling bookname methood from lib object 
        Book book1 = lib.bookName("Java",4,"Ahmed");
        Book book2 = lib.bookName("R");
        Book book3 = lib.bookName("Python", 2);
        //user asking if book is availaable 
        User user1 = new User("R",lib);
        //librarian checking if book is available
        lib.bookCheck("R");
         //user asking if book is availaable 
        User user2 = new User("python",6,lib);
    }
}
