package encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
    private boolean isReserved;
    //constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
    //overriding reserved item method
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("DVD '" + getTitle() + "' is already reserved.");
        }
    }
    //overriding check if available method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
