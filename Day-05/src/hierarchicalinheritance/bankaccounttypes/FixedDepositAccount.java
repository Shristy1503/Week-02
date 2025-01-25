package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
    double minimumBalance;

    // constructor
    public FixedDepositAccount(String accountNumber, double balance, double minimumBalance){
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }
    // display account type
    public void displayAccountType(){
        System.out.println("This is fixed deposit account");
    }
    @Override
    //overrideing method to display
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Minimum balance: " + minimumBalance);
    }

}
