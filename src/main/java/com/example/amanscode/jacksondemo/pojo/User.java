package com.example.amanscode.jacksondemo.pojo;

public class User {
    private String accountId;
    private String userName;
    private double balance;

    public User(String accountId, String userName, double balance) {
        this.accountId = accountId;
        this.userName = userName;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "accountId='" + accountId + '\'' +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
