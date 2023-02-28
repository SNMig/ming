package com.javabase.week2day004;
//定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现Weapon类中的抽象方法。
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开始攻击");

    }

    @Override
    public void move() {
        System.out.println("坦克开始移动");
    }
}
