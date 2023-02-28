package com.javabase.week2day003;

public class AnimalDao {
    private Animal[] animals;
    private int size;
    public AnimalDao(){
        this(10);
    }
    public AnimalDao(int a){
        animals=new Animal[a];
    }

//    public void AddAnimal(Animal animal){
//
//    }
    public boolean add(Animal animal){
        for (int i=0;i<animals.length;i++){

            if (animals[i].equals(animal)){
                animals[i]=animal;
            }
        }
        return false;
    }
}
