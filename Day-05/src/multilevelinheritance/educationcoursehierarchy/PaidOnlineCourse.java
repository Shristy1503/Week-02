package multilevelinheritance.educationcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayInfo to include fee and discount details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }

    // Method to calculate the final fee after applying the discount
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
