package com.javabase.week2day004;

public class Flighter extends Weapon{
    @Override
    public void attack() {

        System.out.println("战机开始攻击");
    }

    @Override
    public void move() {
        System.out.println("战机开始移动");
    }
}
