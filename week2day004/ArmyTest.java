package com.javabase.week2day004;

import java.util.Scanner;

public class ArmyTest {
    public static void main(String[] args) {
        Army army = new Army(10);
        Scanner scanner = new Scanner(System.in);
        army.addWeapon(new Tank());
        army.addWeapon(new Flighter());
        army.addWeapon(new WarShip());
        army.addWeapon(new Tank());
        army.attackAll();
        army.move();
    }

}