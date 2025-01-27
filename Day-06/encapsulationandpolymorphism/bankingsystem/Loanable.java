package encapsulationandpolymorphism.bankingsystem;

public interface Loanable {
    //abstract methods
    abstract void applyForLoan(double amount);
    abstract boolean calculateLoanEligibility(double amount);
}
