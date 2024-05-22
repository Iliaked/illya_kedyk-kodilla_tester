package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private List<Integer> transactions;

    public CashMachine() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(int amount) {
        transactions.add(amount);
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return transactions.size();
    }

    public List<Integer> getTransactions() {
        return transactions;
    }
}
