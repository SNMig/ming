package com.javabase.week3day004.job;

import com.javabase.week3day004.job.User;
import com.javabase.week3day004.job.UserDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static com.javabase.week3day004.job.UserData.userList;

public class ListUserDao implements UserDao {


    @Override
    public void add(User user) {

        if (user==null){
            throw new IllegalArgumentException("用户不能为空");

        }
        if(UserData.userList.contains(user)){
            throw new IllegalArgumentException("用户不存在");
        }
        UserData.userList.add(user);
    }

    @Override
    public User getById(int id) {
//        User user1=new User();
//        for (User user : userList) {
//            if (user.getId()==id){
//                user1=user;
//            }
//        }
//        return user1;
        return userList.stream().filter(user -> user.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<User> getByName(String name) {
//        List<User>user1=new ArrayList<>();
//        for (User user : userList) {
//            if (user.getName().equals(name)){
//                user1.add(user);
//            }
//        }
//        return user1;
        return userList.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public void updateById(User user) {
        if (user==null){
            throw new IllegalArgumentException("数据不能为空");
        }
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId()== user.getId()){
                if (user.getBirthdate()==null){
                    user.setBirthdate(userList.get(i).getBirthdate());
                }
                if (user.getRegtime()==null){
                    user.setRegtime(userList.get(i).getRegtime());
                }
                userList.set(i,user);
                return;
            }
        }
        throw new IllegalArgumentException("没有该用户");

    }

    @Override
    public void deleteById(int id) {
//        for (int i = 0; i < userList.size(); i++) {
//            if (userList.get(i).getId()==id){
//                userList.remove(i);
//                return;
//            }
//        }

        Iterator<User>iterator=userList.iterator();
        while (iterator.hasNext()){
            User u=iterator.next();
            if (u.getId()==id){
                iterator.remove();
                return;
            }
        }
    }
}
