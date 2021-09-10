package com.codingdojo.bankacc;

import java.util.Locale;
import java.util.Random;

public class BankAccount {

    private long accountNumber;
    private double checkingBalance;
    private double savingBalance;
    public static Integer numAccounts = 0;
    public static Double totalMoneyAllAccounts = 0d;
    public static String ACCOUNT_CHECKING = "checking";
    public static String ACCOUNT_SAVINGS = "savings";
    private static Long generateRandom() {   //why should i use static here
        Random rand = new Random();
        String num = "";
        for (int i = 0; i<10; i++){
            num = num.concat(String.valueOf(rand.nextInt(10)));
        }
        return Long.parseLong(num);
    }

// ● Create a BankAccount class.

// ● The class should have the following attributes: (double) checking balance, (double) savings balance.

// ● Create a class member (static) that has the number of accounts created thus far.

// ● Create a class member (static) that tracks the total amount of money stored in every account created.

    // ● In the constructor, be sure to increment the account count.
    public BankAccount() {
        BankAccount.numAccounts++;
        this.accountNumber = this.generateRandom();
    }

    // ● Create a getter method for the user's checking account balance.
    public double getCheckingAccountBalance() {
        return this.checkingBalance;
    }

    // ● Create a getter method for the user's saving account balance.
    public double getSavingsAccountBalance() {
        return this.savingBalance;
    }

    // ● Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositMoney(double amount, String accountType) {
        if (ACCOUNT_SAVINGS.equals(accountType.toLowerCase())) {
            this.savingBalance += amount;
            totalMoneyAllAccounts+= amount;
        } else if (ACCOUNT_CHECKING.equals(accountType.toLowerCase())) {
            this.checkingBalance += amount;
            totalMoneyAllAccounts+= amount;
        }
    }



    // ● Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
public void withdrawMoney(double amount , String accountType) {
    if (ACCOUNT_SAVINGS.equals(accountType.toLowerCase())) {
        if(this.savingBalance> amount) {
            this.savingBalance -= amount;
            totalMoneyAllAccounts -= amount;

        }
    } else if (ACCOUNT_CHECKING.equals(accountType.toLowerCase())) {
        if(this.checkingBalance >amount) {
            this.checkingBalance -= amount;
            totalMoneyAllAccounts-= amount;
        }
    }
}

    // ● Create a method to see the total money from the checking and saving.
    public void  totalMoney() {
        double total = this.savingBalance + this.checkingBalance;
        System.out.println(accountNumber + " Checking Balance: "+ this.checkingBalance+ ", Saving Balance: "+ this.savingBalance+ " Total Balance: " + total);
    }



}
//in this way it always recreate  new random number?
// ● Users should not be able to set any of the attributes from the class.?
// why use static in generateRandom();?