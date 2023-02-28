package com.javabase.week2day004;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private User[] users;
    private int size;
    public UserDao(){
        this(10);
    }
    public UserDao(int a){
        users=new User[a];
    }

    public List<User> search(List<User> list1, List<User> list2){
        if (list1==null||list2==null){
            return null;
        }
        List<User> p=new ArrayList<>();
        for (User user : list1) {
            if (list2.contains(user)){
                p.add(user);
            }
        }
        return p;
    }





}
