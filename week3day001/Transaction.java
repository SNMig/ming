package com.javabase.week3day001;

public class Transaction {
    private Trader trader;
    private int year;

    private int money;

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", money=" + money +
                '}';
    }

    public Transaction() {
    }

    public Transaction(Trader trader, int year, int money) {
        this.trader = trader;
        this.year = year;
        this.money = money;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
