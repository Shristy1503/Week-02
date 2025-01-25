package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    //constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    // display account type
    public void displayAccountType(){
        System.out.println("This is checking account");
    }
    @Override
    //overrideing method to display
    public void displayDetails(){
        super.displayDetails();
        System.out.println("withdraw limit: " + withdrawalLimit);
    }
}
