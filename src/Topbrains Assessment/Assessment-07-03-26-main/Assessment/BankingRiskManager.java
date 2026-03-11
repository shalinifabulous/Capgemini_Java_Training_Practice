package Assessment;

public class BankingRiskManager {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(30000, true);

        try {
            acc.withdraw(60000);
        }
        catch (InvalidAmountException |
               ExceedsLimitException |
               InactiveAccountException |
               InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction process completed.");
        }
    }
}