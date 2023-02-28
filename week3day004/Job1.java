package com.javabase.week3day004;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Job1 {
    class User{
        private String Name;
        private int Age;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }
    }

    public void main(String[] args) throws IOException {
        User user=new User();
        user.setName("Tom");
        user.setAge(24);
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream("test"));

    }
}
