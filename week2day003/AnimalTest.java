package com.javabase.week2day003;

import java.util.Scanner;

//设计Animal类，Dog类，.....,其中Animal有一个方法eat(),子类重写eat()，重写equals，类型一样
//测试代码，声明一个Animal数组，存储若干动物，不能加重复的，遍历所有的元素，访问其eat


public class AnimalTest {


    Animal[] animals=new Animal[5];

    public static void main(String[] args) {
        Animal[] animals=new Animal[5];
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Fish fish=new Fish();
        animals[0]=dog1;
        animals[1]=dog2;
        animals[2]=cat1;
        animals[3]=cat2;
        animals[4]=fish;
        for (Animal animal : animals) {
            animal.eat();


        }



    }
}
