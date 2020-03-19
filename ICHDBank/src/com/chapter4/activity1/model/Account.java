package com.chapter4.activity1.model;

public class Account {
 private String accountNumber;
    private String accountCreationDate;
    private double balance;
    private String accountType;
    public Account(){        
    }
    public Account(String accountNumber, String accountType, String accountCreationDate, double balance){
        this.accountNumber=accountNumber;
        this.accountCreationDate=accountCreationDate;
        this.balance=balance;
this.accountType=accountType;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the accountCreationDate
     */
    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    /**
     * @param accountCreationDate the accountCreationDate to set
     */
    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
   
}
