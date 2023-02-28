package com.javabase.week3day005;

public class Job1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<User> s= (Class<User>) Class.forName("com.javabase.week3day005.User");
        User user=s.newInstance();
        user.test1();
        user.setName("张三");
        System.out.println(user.getName());
    }
}
