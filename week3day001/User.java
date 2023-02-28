package com.javabase.week3day001;

public class User implements Comparable<User>{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public int compareTo(User o) {
        return age - o.getAge();
       /* if (age > o.getAge()) {
            return 1;
        } else if (age < o.getAge()) {
            return -1;
        } else {
            return 0;
        }*/
    }
}
