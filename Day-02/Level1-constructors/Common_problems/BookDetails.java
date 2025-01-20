 public class BookDetails{
   public static void main(String[]args){
     // Using the default constructor
     Book book1 = new Book();
	 System.out.println("Book 1:");
     book1.display();
   
     // Using the parameterised constructor	 
     Book book2 = new Book("Verity", "Collen Hover", 795.0);
     System.out.println("\nBook 1:");
     book2.display();
   }
 }
   class Book{
     String title;
	 String author;
	 double price;
	 
	 //default constructor
	 Book(){
	   title = "Harry Potter";
	   author = "J.K.Rowling";
	   price = 895.0;
	 }
	 
	 // parameterised constructor
	 Book(String title, String author, double price){
	   this.title = title;
       this.author = author;
       this.price = price;	   
	 }
	 
	 //method to display
	 public void display(){
	    System.out.println("Book title is: " + title);
		System.out.println("Book author is: " + author);
		System.out.println("Book price is: " + price);
	 }
   }
   
 
    