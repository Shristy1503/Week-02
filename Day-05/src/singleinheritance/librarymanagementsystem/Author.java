package singleinheritance.librarymanagementsystem;

public class Author extends Book{
    String name;
    String bio;

    //constructor
    public Author(String title, String publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // override method to display
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author name: " + name + " | " + " Author bio: " + bio);
    }

}
