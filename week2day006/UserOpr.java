package com.javabase.week2day006;

/**
 * *         1.2、声明用户操作类 (UserOpr),该类有两个静态方法：
 *  *         ⚫ getCall 接受 User 类型的参数。然后根据 User 的年龄范围返回该用户的称呼
 *  *         （<18, 称为少年 ，19 -49 ，称为成年 ,50 及以 上称为老年 ）。
 *  *         ⚫ compare 比较两个 User 的年龄，第一个 User 年长返回 1，第二个年长返回1，同年龄返回 0
 */
public class UserOpr {
    private User[] users;

    public UserOpr(){
        this(10);
    }
    public UserOpr(int capciy){
        users=new User[capciy];
    }
    private int size;

    public static String getCall(User uesr){
        String Name;
        if(uesr.getAge()<18){
            Name= uesr.getName();
            return Name="少年" ;
        } else if (uesr.getAge()>=19&&uesr.getAge()<49) {
            Name= uesr.getName();
            return Name="成年";
        }else Name= uesr.getName();
        return Name="老年";
    }


    public static int compare(User user1,User user2){
        if (user1.getAge()> user1.getAge()){
            return  1;
        } else if (user1.getAge()< user2.getAge()) {
            return -1;
        }else return 0;
    }
}
