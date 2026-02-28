class BankAccount {

    private int accountNumber;
    private double balance;

    // Setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Day07_Encapsulation {

    public static void main(String[] args) {

        System.out.println("Day 7: Encapsulation Practice");

        BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
        account.setBalance(5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("Day 7 Practice Completed");
    }
}