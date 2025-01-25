package hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount{
    int interestRate;
    // constructor
    public SavingsAccount(String accountNumber, double balance, int interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    // display account type
    public void displayAccountType(){

        System.out.println("This is Savings account");
    }
    @Override
    //overrideing method to display
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Intrest rate: " + interestRate);
    }

}
