package com.javabase.week2day004;

public class WarShip extends Weapon {
    @Override
    public void attack() {
        System.out.println("舰艇开始攻击");
    }

    @Override
    public void move() {
        System.out.println("舰艇开始移动");
    }
}
