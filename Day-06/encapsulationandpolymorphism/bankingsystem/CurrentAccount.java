package encapsulationandpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit;
    //constructor
    public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
   // overriding calculate interest method
    @Override
    public double calculateInterest() {
        // Current accounts typically do not earn interest
        return 0;
    }
    // overriding apply loan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " has been submitted for Current Account.");
    }
    // overriding eligible for loan loan method
    @Override
    public boolean calculateLoanEligibility(double amount) {
        // Example eligibility criteria: must have a positive balance or within overdraft limit
        return getBalance() + overdraftLimit >= amount;
    }
}
