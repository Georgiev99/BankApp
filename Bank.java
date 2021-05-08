package com.java;

public class Bank {
    private int userId;
    private String name;
    private char gender;
    private int balance;
    private int amount;

    public Bank (int userId, String name,char gender,int balance,int amount){
        this.userId = userId;
        this.name = name;
        this.gender= gender;
        this.balance = balance;
        this.amount =amount;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit (){
        this.balance += this.amount;
        return this.balance;
    }
    public int withdrawal(){
        if(this.amount < 0){
            return -1;
        }
        else if(this.balance - this.amount < 0){
            return -1;
        }
        else{
            this.balance -= this.amount;
            return this.balance;
        }
    }
    public String checkBalance (){
        return "The current balance is " +this.balance;
    }


}
