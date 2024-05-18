package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void debit (int money) throws InsufficientFundsException {
        if (money > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= money;
    }
}
