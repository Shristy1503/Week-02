 import java.util.ArrayList;  
   class Book{
     private String title;
	 private String author;
	 
	 //constructor
	 public Book(String title, String author){
	   this.title = title;
	   this.author = author;
	 }
	 
	 //getter to access title
	  public String getTitle(){
	    return title;
	  }
	  
	 //getter to access author
	  public String getAuthor(){
	    return author;
	  }
     // display book details
	 public void displayBooks(){
	     System.out.println("Title of book: " + title + ", Author of book: " + author);
	 }
   }
   // import java.util.ArrayList;  
   class Library{
     private String libraryName;
	 private ArrayList<Book> books;
	 
	 //constructor
	 public Library(String libraryName){
	   this.libraryName = libraryName;
	   this.books = new ArrayList<>();
	 }
	 
	 //methodt to add books
	 public void addBooks(Book bookSingle){
	    books.add(bookSingle);
	 }
	 
	 //display books
	 public void displayLibrary(){
	    System.out.println("Library: " + libraryName);
		System.out.println("Books in library: ");
		for(int i=0;i<books.size();i++){
		  Book bookSingle = books.get(i);
		  bookSingle.displayBooks();
		}
	 }
   }
   
   public class LibraryBookAggregate{
      public static void main(String[]args){
	    
		//book object
		Book book1 = new Book("Harry potter and goblet of fire", "J.K. Rowling");
		Book book2 = new Book("Secret", "Holly Jackson");
		Book book3 = new Book("Norweign woods", "Murakami");
		
	    // library object
		Library library1 = new Library("central libraray");
		Library library2 = new Library("Famous library");
		
		// call add method of library
		library1.addBooks(book1);
		library2.addBooks(book2);
		library2.addBooks(book3);
		
		//display
		library1.displayLibrary();
		library2.displayLibrary();
	  }
   }