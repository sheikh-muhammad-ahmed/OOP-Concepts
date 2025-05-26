package Advance.LibraryManagementSystem;

public class User {
    boolean availabilty;//checking if book is availabe 
    Library lib;//accessing library class or commuunication between librarian and Customer
    //Construuctor if only name is input
    User(String name,Library lib){
        this.lib=lib;
        if (lib.bookCheck(name)== true && lib.numberOfBooks > 0) {// for finding book from library
            
            System.out.println("\nYou can borrow "+name+" from our library");
        }
        else{
            
            System.out.println("\nYou can't borrow "+name+" from our library");
        }
    }
    //Construuctor overload if name edition are input
    User(String name,int edition,Library lib){
        this.lib=lib;
        if (lib.bookCheck(name,edition)== true && lib.numberOfBooks > 0) {
            
            System.out.println("\nYou can borrow "+name+" of "+edition+" edition from our library");
        }
        else{
            
            System.out.println("\nYou can't borrow "+name+" of "+edition+" edition from our library");
        }
    }
    //Constructor overload if name, edition and authorname are input
    User(String name,int edition,String authorName,Library lib){
        this.lib=lib;
        
        if (lib.bookCheck(name,edition,authorName)== true && lib.numberOfBooks > 0) {
            System.out.println("\nYou can borrow "+name+" of "+edition+" edition written by "+authorName+" from our library");
        }
        else{
            System.out.println("\nYou can't borrow "+name+" of "+edition+" edition written by "+authorName+" from our library");
        }
    }
}
