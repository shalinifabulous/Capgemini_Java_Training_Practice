package M1PracticeQuestions;

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

interface Transaction{
    void addMoney(double amount) throws InvalidAmountException;

    void addMoney(double amount, String mode) throws InvalidAmountException;

    void transfer(double amount) throws InvalidAmountException;

    void transfer(double amount, String remarks) throws InvalidAmountException;
}

abstract class DigitalWallet implements Transaction{
    private String walletId;
    private String ownerName;
    private double balance;

    public DigitalWallet(String walletId, String ownerName, double balance){
        if (balance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.walletId = walletId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

    public String getWalletDetails(){
        return "Wallet ID: " + walletId + ", Owner: " + ownerName + ", Balance" + balance;
    }

    protected void validateAmount(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException("Transaction must be greater than zero");
        }
    }

    protected void checkSufficientBalance(double amount){
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficient balance for this transaction");
        }
    }

    public abstract void walletType();
}

class BasicWallet extends DigitalWallet{
    public BasicWallet(String walletId, String ownerName, double balance){
        super(walletId, ownerName, balance);
    }

    @Override
    public void addMoney(double amount) throws InvalidAmountException{
        validateAmount(amount);

        setBalance(getBalance() + amount);
        System.out.println("Money added to Basic wallet");
    }

    @Override
    public void addMoney(double amount, String mode) throws InvalidAmountException{
        System.out.println("MOde of Payment: " + mode);
        addMoney(amount);
    }

    @Override
    public void transfer(double amount) throws InvalidAmountException {
        validateAmount(amount);
        checkSufficientBalance(amount);

        setBalance(getBalance() - amount);
        System.out.println("Transfer successful from Basic Wallet.");
    }

    @Override
    public void transfer(double amount, String remarks) throws InvalidAmountException {
        System.out.println("Transfer Remarks: " + remarks);
        transfer(amount);
    }

    @Override
    public void walletType() {
        System.out.println("This is a Basic Wallet.");
    }
}

class PremiumWallet extends DigitalWallet{

    public PremiumWallet(String walletId, String ownerName, double balance){
        super(walletId, ownerName, balance);
    }

    @Override
    public void addMoney(double amount) throws InvalidAmountException{
        validateAmount(amount);

        double bonus = amount * 0.02;
        setBalance(getBalance() + amount + bonus);

        System.out.println("Money added with 2% bonus in Premium Wallet");
    }

    @Override
    public void addMoney(double amount, String mode) throws InvalidAmountException{
        System.out.println("Mode of payment: "+ mode);
        addMoney(amount);
    }

    @Override
    public void transfer(double amount) throws InvalidAmountException {
        validateAmount(amount);
        checkSufficientBalance(amount);

        setBalance(getBalance() - amount);
        System.out.println("Transfer successful from Premium Wallet.");
    }

    @Override
    public void transfer(double amount, String remarks) throws InvalidAmountException {
        System.out.println("Transfer Remarks: " + remarks);
        transfer(amount);
    }

    @Override
    public void walletType() {
        System.out.println("This is a Premium Wallet.");
    }
}


public class WalletEngine {

    public static void main(String[] args) {

        // Runtime Polymorphism
        DigitalWallet wallet = new PremiumWallet("W101", "Shalini Gupta", 5000);

        wallet.walletType();
        System.out.println(wallet.getWalletDetails());

        try {

            wallet.addMoney(1000);
            wallet.addMoney(500, "UPI");

            wallet.transfer(2000);
            wallet.transfer(1000, "Payment to friend");

            // This will cause exception
            wallet.transfer(10000);

        }
        catch (InvalidAmountException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("Final Balance: " + wallet.getBalance());
    }
}