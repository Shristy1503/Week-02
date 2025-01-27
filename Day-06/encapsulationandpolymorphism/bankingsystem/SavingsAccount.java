package encapsulationandpolymorphism.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;
    //constructor
    public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }
    // overriding calculate interest method
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    // overriding apply loan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " has been submitted for Savings Account.");
    }
    // overriding eligible for loan loan method
    @Override
    public boolean calculateLoanEligibility(double amount) {
        // Example eligibility criteria: must have at least $1000 in balance
        return getBalance() >= 1000;
    }
}
