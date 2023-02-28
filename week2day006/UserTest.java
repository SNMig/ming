package com.javabase.week2day006;

import java.util.ArrayList;
import java.util.List;

/**
 * *         1.3 实现测试类，在 main 方法中实例化 User 对象并使用构造方法赋初值，然后输出
 *  *         UserOpr 的 getCall 方法返回的结果及两个。
 */
public class UserTest {
    public static void main(String[] args) {
        UserOpr userOpr=new UserOpr(3);




        User user1=new User("李四",17);
        User user2=new User("王五",19);
        User user3=new User("张三",56);


        String s=UserOpr.getCall(user1);
        System.out.println(s);

        int a=UserOpr.compare(user1,user2);
        System.out.println(a);
    }
}
