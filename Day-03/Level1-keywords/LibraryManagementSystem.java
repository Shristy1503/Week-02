  public class LibraryManagementSystem{
    public static void main(String[] args) {
	   
	  // call statics method 
      Book.displayLibraryName();	  
	  Book book1 = new Book("Harry Potter", "J.K. Rowling", "36713");
	  Book book2 = new Book("Verity", "Colleen Hoover", "35711");
	  
	  // display book details
	  System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();
		
	  System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
	
  }	
   class Book{
    private String title;
	private String author;
	private final String isbn;
	private static String libraryName = "Central Library";
	
	//constructor
	Book(String title, String author, String isbn){
	  this.title = title;
	  this.author = author;
	  this.isbn = isbn;
	}
	
	// static method to display library name
	public static void displayLibraryName(){
	  System.out.println("Name of library is: " + libraryName);
	}
    
	// display book details
	public void displayBookDetails(){
	  if(this instanceof Book){
		 System.out.println("Library Name: " + libraryName);
	     System.out.println("Title of book is: " + title);
		 System.out.println("Author of book is: " + author);
		 System.out.println("ISBN of book is: " + isbn);
	} else{
	     System.out.println("Invalid object of book");
	  }
	}
   }
  