package com.javabase.week3day001;
//声明用户类，具有姓名与年龄，实现Comparable接口，其逻辑是先比较年龄，年龄一样则比较姓名的长度
// 测试方法中奖若干用户实例存储到List中，实现:
//        使用打擂台的方式找出最大的用户
//        进行排序
//        +


public class User1 implements Comparable<User1>{
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User1() {

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
    public int compareTo(User1 o) {
        if (age-o.getAge()>0){
            return 1;
        }else if (age-o.getAge()<0){
            return -1;
        }else {
            return name.length()-o.getName().length();
        }
}
}
