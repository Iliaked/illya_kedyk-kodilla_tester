package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public int getTotalBalance() {
        int balance = 0;
        for (int i = 0; i < size; i++) {
            balance = balance + cashMachines[i].getBalance();
        }
        return balance;
    }
}