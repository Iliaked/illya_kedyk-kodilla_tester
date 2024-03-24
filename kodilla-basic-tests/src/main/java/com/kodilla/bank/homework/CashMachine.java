package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[20];
        this.size = 0;
    }

    public void cashIn(int amount) {
        if (amount > 0) {
            transactions[size++] = amount;
        } else {
            System.out.println("Wrong amount, try again.");
        }
    }

    public void cashOut(int amount) {
        if (amount > 0) {
            transactions[size++] = -amount;
        } else {
            System.out.println("Wrong amount, try again.");
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < size; i++) {
            balance = balance + transactions[i];
        }
        return balance;
    }

    public int getTransactionQuantity() {
        return size;
    }
}
