package com.javabase.week3day003;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
List<User>
声明方法，对其中的用户按照年龄排序（升序）并回写
声明方法，按照性别进行统计用户信息
 */
public class Job5 {
    public static void main(String[] args)throws Exception {
        ageSort("F:\\新建文件夹\\用户数据.CSV");
    }
    public static List<User>ageSort(String path) throws Exception{
        List<User> userList=new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader(path))){

            String  s=null;

            while ((s=reader.readLine())!=null){
                User user=split(s);
                userList.add(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        userList.sort((user1,user2)->user1.getAge()-user2.getAge());
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for (User user1 : userList) {
                writer.write(user1.toString());
                writer.newLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
    public static List<User>genderNum(List<User> user,String gend){
        user.stream().filter(n->n.getGender().equals(gend));
        return user;
    }
    public static User split(String s){

        try {


            String[] str = s.split(",");
            User user = new User(Integer.parseInt(str[0]), str[1], str[2], Integer.parseInt(str[3]));
            return user;
        }catch (Exception e){
            throw new NumberFormatException(s);
        }
    }
}
