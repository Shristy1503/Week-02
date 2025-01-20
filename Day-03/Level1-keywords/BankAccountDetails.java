  class BankAccount{
    private String accountHolder;
    private final String accountNumber;
    private double balance;
    private static String bankName = "Union Bank"; 
    private static int totalAccounts = 0; 

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber; 
        this.balance = balance;
        totalAccounts++; 
    }

    // method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited INR " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew INR " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount must be greater than 0");
        }
    }

    // Method to display current balance
    public void displayBalance() {
	  //instanceof to check if object is of same class
        if (this instanceof BankAccount) { 
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: INR " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
  }

  public class BankAccountDetails{
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount("Sammy", "0192368", 5000.0);
        BankAccount account2 = new BankAccount("Shristy", "0192356", 1000.0);

        // Display total accounts
        BankAccount.getTotalAccounts();

        // Display initial account details
        System.out.println("\nInitial Account Details for Account 1:");
        account1.displayBalance();

        System.out.println("\nInitial Account Details for Account 2:");
        account2.displayBalance();

        // call deposit money
        System.out.println("\nDepositing money to Account 1:");
        account1.deposit(45000.0);
        account1.displayBalance();

        // call withdraw money
        System.out.println("\nWithdrawing money from Account 2:");
        account2.withdraw(500.0);
        account2.displayBalance();

        // Display total accounts 
        System.out.println("\nUpdated Total Accounts:");
        BankAccount.getTotalAccounts();
    }
}
