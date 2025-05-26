package Advance.LibraryManagementSystem;

public class Book {
    //Boook details
     String name,authorName;
     int edition;
    //Constructors which get book data from library 
    Book(String name,int edition,String authorName){
        this.name=name;
        this.edition=edition;
        this.authorName=authorName;
    }
    Book(String name,int edition){
        this.name=name;
        this.edition=edition;
    }
    Book(String name){
        this.name=name;
    }
    
   
    
}
