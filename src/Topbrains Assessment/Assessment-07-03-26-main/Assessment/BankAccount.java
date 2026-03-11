package Assessment;

class BankAccount {

    double balance;
    boolean active;

    BankAccount(double balance, boolean active) {
        this.balance = balance;
        this.active = active;
    }

    public void withdraw(double amount)
            throws InvalidAmountException,
                   ExceedsLimitException,
                   InactiveAccountException,
                   InsufficientBalanceException {

        if(amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }

        if(amount > 50000) {
            throw new ExceedsLimitException("Withdrawal limit exceeded");
        }

        if(!active) {
            throw new InactiveAccountException("Account is inactive");
        }

        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}