package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<CashMachine> cashMachines;

    public Bank() {
        this.cashMachines = new ArrayList<>();
    }

    public void addCashMachine(CashMachine cashMachine) {
        cashMachines.add(cashMachine);
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawalsCount() {
        int withdrawalCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    withdrawalCount++;
                }
            }
        }
        return withdrawalCount;
    }

    public int getTotalDepositsCount() {
        int depositCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    depositCount++;
                }
            }
        }
        return depositCount;
    }

    public double getAverageWithdrawal() {
        int totalWithdrawals = 0;
        int withdrawalCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    totalWithdrawals += transaction;
                    withdrawalCount++;
                }
            }
        }
        if (withdrawalCount == 0) {
            return 0;
        } else {
            return (double) totalWithdrawals / withdrawalCount;
        }
    }

    public double getAverageDeposit() {
        int totalDeposits = 0;
        int depositCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    totalDeposits += transaction;
                    depositCount++;
                }
            }
        }
        if (depositCount == 0) {
            return 0;
        } else {
            return (double) totalDeposits / depositCount;
        }
    }
}