package com.javabase.week2day001;

public class Student {
    private String name;   //姓名
    private int age;   //年龄
    private char gender;//性别
    private boolean isStuding;  //是否在读，在读true，其他false



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isStuding() {
        return isStuding;
    }

    public void setStuding(boolean studing) {
        isStuding = studing;
    }


}
