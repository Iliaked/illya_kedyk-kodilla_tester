package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankCashMachineTestSuite {
    private CashMachine cashMachine;
    private Bank bank;
    private CashMachine cm1;
    private CashMachine cm2;

    @BeforeEach
    public void setUp() {
        cashMachine = new CashMachine();

        bank = new Bank();
        cm1 = new CashMachine();
        cm2 = new CashMachine();

        cm1.addTransaction(100);
        cm1.addTransaction(-50);
        cm1.addTransaction(200);

        cm2.addTransaction(300);
        cm2.addTransaction(-100);
        cm2.addTransaction(-150);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);
    }

    @Test
    public void testAddTransaction() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        List<Integer> transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.size());
        assertEquals(100, transactions.get(0));
        assertEquals(-50, transactions.get(1));
    }

    @Test
    public void testGetBalance() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(250, cashMachine.getBalance());
    }

    @Test
    public void testGetNumberOfTransactions() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(2, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void testGetTotalBalance() {
        assertEquals(300, bank.getTotalBalance());
    }

    @Test
    public void testGetTotalWithdrawalsCount() {
        assertEquals(3, bank.getTotalWithdrawalsCount());
    }

    @Test
    public void testGetTotalDepositsCount() {
        assertEquals(3, bank.getTotalDepositsCount());
    }

    @Test
    public void testGetAverageWithdrawal() {
        assertEquals(-100.0, bank.getAverageWithdrawal());
    }

    @Test
    public void testGetAverageDeposit() {
        assertEquals(200.0, bank.getAverageDeposit());
    }

    @Test
    public void testGetAverageWithdrawalWhenNoWithdrawals() {
        Bank emptyBank = new Bank();
        CashMachine emptyCashMachine = new CashMachine();
        emptyCashMachine.addTransaction(100);
        emptyCashMachine.addTransaction(200);
        emptyBank.addCashMachine(emptyCashMachine);
        assertEquals(0, emptyBank.getAverageWithdrawal());
    }

    @Test
    public void testGetAverageDepositWhenNoDeposits() {
        Bank emptyBank = new Bank();
        CashMachine emptyCashMachine = new CashMachine();
        emptyCashMachine.addTransaction(-100);
        emptyCashMachine.addTransaction(-200);
        emptyBank.addCashMachine(emptyCashMachine);
        assertEquals(0, emptyBank.getAverageDeposit());
    }
}
