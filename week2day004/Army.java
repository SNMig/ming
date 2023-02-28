package com.javabase.week2day004;
/**
 * 2、写一个类Army,代表一支军队:
 *         	  这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
 *         	  该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w。
 *         	  该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
 *         	  在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动。
 */

public class Army {
    private Weapon[] weapons;
    private int size;

    public Army(){
        this(20);
    }
    public Army(int nums){
        weapons=new Weapon[nums];
    }
    //把参数wa所代表的武器加入到数组w中
    public void addWeapon(Weapon wa){

        if(size< weapons.length){
            weapons[size++]=wa;
        }
    }

    //方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动
    public void attackAll(){

        for (int i=0;i<size;i++){
            weapons[i].attack();
            System.out.println(weapons[i]+"已出动");
        }
    }

    public void move(){
        for (int i = 0; i < size; i++) {
            weapons[i].move();
            System.out.println(weapons[i]+"已移动");
        }

    }
}
