package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    String accountNumber;
    double balance;
    //constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType(){
        System.out.println("This is General account");
    }
    public void displayDetails(){
        System.out.println("Account number: " + accountNumber + " | " + " account balance: " + balance);
    }

}
