package encapsulationandpolymorphism.bankingsystem;
import java.util.ArrayList;
import java.util.List;
public class BankingSystem {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA001", "Shristy", 1500.00, 0.05));
        accounts.add(new CurrentAccount("AB001", "Arjun", 500.00, 200.00));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: $" + account.getBalance());

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);
        }
        // Demonstrate loan application and eligibility
        for (Loanable loanableAccount : accounts.stream().filter(account -> account instanceof Loanable).map(account -> (Loanable) account).toList()) {
            double loanAmount = 1000.00;
            loanableAccount.applyForLoan(loanAmount);
            boolean eligible = loanableAccount.calculateLoanEligibility(loanAmount);
            System.out.println("Loan Eligibility for $" + loanAmount + ": " + (eligible ? "Eligible" : "Not Eligible"));
        }
    }
}
