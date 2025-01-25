package hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("342325", 30000);
        account.displayAccountType();
        account.displayDetails();
        SavingsAccount account1 = new SavingsAccount("2364221231", 34000, 3);
        account1.displayAccountType();
        account1.displayDetails();
        CheckingAccount account2 = new CheckingAccount("53521321231", 30422, 10000);
        account2.displayAccountType();
        account2.displayDetails();
        FixedDepositAccount account3 = new FixedDepositAccount("2323252", 50000, 500);
        account3.displayAccountType();
        account3.displayDetails();

    }
}
