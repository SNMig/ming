package com.javabase.week2day003;

//设计Animal类，Dog类，.....,其中Animal有一个方法eat(),子类重写eat()，重写equals，类型一样
//测试代码，声明一个Animal数组，存储若干动物，不能加重复的，遍历所有的元素，访问其eat

import java.util.Objects;

class Animal {


    private String battle;

    public String getBattle() {
        return battle;
    }

    public void setBattle(String battle) {
        this.battle = battle;
    }

    public void eat() {
        System.out.println("Animal吃草或肉");
    }

}
class Cat extends Animal{

    private String jump;
}
class Fish extends Animal{
    private String swimming;

}
class Dog extends Animal {

    private String running;
    public Dog() {

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("dog吃肉");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(running, dog.running);
    }

    public class AnimalDao {
        private Animal[] animals;
        public AnimalDao(){
            this(3);
        }
        public AnimalDao(int a){
            animals=new Animal[a];
        }
    }
}
