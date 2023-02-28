package com.javabase.week2day004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        Scanner scanner=new Scanner(System.in);
        List<User> userList1=new ArrayList<>();
        List<User> userList2=new ArrayList<>();
        for (int i=0;i<5;i++){
            System.out.println("请输入第一组"+i+1+"个名字：");
            System.out.println("请输入第一组"+i+1+"个密码：");
            userList1.add(new User(scanner.next(),scanner.next()));

        }
        for (int i=0;i<5;i++){
            System.out.println("请输入第二组"+i+1+"个名字：");
            System.out.println("请输入第二组"+i+1+"个密码：");
            userList2.add(new User(scanner.next(),scanner.next()));
        }
        List<User> res=userDao.search(userList1,userList2);

        for (User re : res) {
            System.out.println("--------一样的结果--------------");
            System.out.println(re.getName()+re.getPassword());
        }
    }
}
