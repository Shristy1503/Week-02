 public class BookDetail{
    public static void main(String[] args) {
        // create objects of class Book
        Book book = new Book("Harry Potter", "J.K. Rowlling", 800.0);

        // Display details of book
        System.out.println("Book details :");
        book.displayResult();

    }
 }

class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the details
    public void displayResult() {
        System.out.println("Title of book: " + title);
        System.out.println("Author of book: " + author);
        System.out.println("Price of book: " + price);
    }
}