package com.javabase.week2day004;

/**
 * 1、定义一个抽象类Weapon,该抽象类有两个抽象方法attack()，move()：这两个方法分别表示武器的攻击方式和移动方式。
 * 2、写一个类Army,代表一支军队:
 * 	  这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
 * 	  该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w。
 * 	  该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
 * 	  在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动。
 */
public abstract class Weapon {
    public abstract   void attack();
    public abstract  void move();

}
