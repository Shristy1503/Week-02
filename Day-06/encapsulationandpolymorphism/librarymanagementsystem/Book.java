package encapsulationandpolymorphism.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
    private boolean isReserved;
     //constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
  //overriding loan duration method
    @Override
    public int getLoanDuration() {
        return 14;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
