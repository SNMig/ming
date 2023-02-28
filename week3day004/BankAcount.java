package com.javabase.week3day004;

public class BankAcount {
    private  double money;

    public BankAcount(double money) {
        this.money = money;
    }

    public  void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        synchronized (this){
            return money;
        }
    }

     public   void depoist(double amount){
        synchronized (this){
            money+=amount;
        }

    }
    public   void withdraw(double amount){
        synchronized (this){
            money-=amount;
        }

    }
}
