package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cm1 = new CashMachine();
        cm1.addTransaction(100);
        cm1.addTransaction(-50);
        cm1.addTransaction(200);

        CashMachine cm2 = new CashMachine();
        cm2.addTransaction(300);
        cm2.addTransaction(-100);
        cm2.addTransaction(-150);

        Bank bank = new Bank();
        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        System.out.println("Total Balance: " + bank.getTotalBalance());
        System.out.println("Total Withdrawals Count: " + bank.getTotalWithdrawalsCount());
        System.out.println("Total Deposits Count: " + bank.getTotalDepositsCount());
        System.out.println("Average Withdrawal: " + bank.getAverageWithdrawal());
        System.out.println("Average Deposit: " + bank.getAverageDeposit());
    }
}
