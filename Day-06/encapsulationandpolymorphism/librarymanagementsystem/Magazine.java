package encapsulationandpolymorphism.librarymanagementsystem;

public class Magazine extends LibraryItem implements  Reservable{
    private boolean isReserved;
    //constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    //overriding loan duration method
    @Override
    public int getLoanDuration() {
        return 7;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
