package com.javabase.week2day001;

import java.util.Scanner;

public class StudentDaoTest {
    static Scanner scanner = new Scanner(System.in);
    static StudentDao studentDao = new StudentDao();


    static Student inPut(){
        Student newStudent1 = new Student();
        System.out.println("请输入新增学生信息");
        System.out.print("请输入学生姓名");
        newStudent1.setName(scanner.next());
        System.out.print("请输入学生年龄");
        newStudent1.setAge(scanner.nextInt());
        System.out.print("请输入学生性别");
        newStudent1.setGender(scanner.next().charAt(0));
        System.out.print("请输入是否在读");
        newStudent1.setStuding(scanner.nextBoolean());
        return newStudent1;
    }

    static void addTest() {
        String s;
        do {
            studentDao.addStudent(inPut());
            System.out.print("是否继续录入y/n");
            s = scanner.next();
        } while (s.equals("y"));
    }


    public static void main(String[] args) {


        while (true) {
            System.out.println("欢迎使用学生管理系统");
            System.out.println("按1.查询所有学生名单");
            System.out.println("按2.增加所有学生名单");
            System.out.println("按3.在指定位置添加学生");
            System.out.println("按4.根据名字查询是否存在");
            System.out.println("按5.查询名字所在下表所引");
            int opr = scanner.nextInt();
            switch (opr) {
                case 1:
                    studentDao.printStudents();
                    break;
                case 2:
                    addTest();
                    break;
                case 3:
                    System.out.println("请输入要在第几位添加信息");
                    int num=scanner.nextInt();
                    studentDao.add(num,inPut());
                    break;
                case 4:
                    System.out.println("请要查询输入名字");
                    String name=scanner.next();
                    Student student= studentDao.query(name);
                    System.out.println(student.getName()+student.getAge()+student.getGender());
                    break;
                case 5:
                    System.out.println("请输入要查的名字");
                    String name1=scanner.next();
                    int index= studentDao.get(name1);
                    if (index==-1){
                        System.out.println("不存在");
                    }else {
                        System.out.println("查询的名字下标索引为"+index);
                    }
            }
        }
    }
}
