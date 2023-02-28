package com.javabase.week2day006;

/**
 * 1、编写程序实现以下功能：
 *         1.1、声明用户 (User) 类,该类拥有属性： 姓名 (name), 年龄 (age ), 使用构造方法为
 *         属性赋值 ，并提供对应的 getter 与 setter 方法。


 */
public class User {
    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

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
}
