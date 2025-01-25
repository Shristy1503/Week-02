package singleinheritance.librarymanagementsystem;

public class Book {
    String title;
    String publicationYear;

    //constructor
    public Book(String title, String publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //display details
    public void displayInfo(){
        System.out.println("Title of book: " + title + " | " + " Publication year: " + publicationYear);
    }
}
