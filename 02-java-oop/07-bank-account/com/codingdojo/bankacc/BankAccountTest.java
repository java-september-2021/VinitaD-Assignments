package com.codingdojo.bankacc;

import com.codingdojo.bankacc.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount rohan = new BankAccount();
        BankAccount kavya = new BankAccount();
        rohan.depositMoney(100.20, "savings");
        rohan.totalMoney();
        rohan.depositMoney(100.50, "checKing");
        rohan.withdrawMoney(100, "checking");
        rohan.totalMoney();
        kavya.depositMoney(220, "savings");
        kavya.depositMoney(220, "savings");
        kavya.totalMoney();
        System.out.println(BankAccount.numAccounts);
        System.out.println(BankAccount.totalMoneyAllAccounts);
    }
}
