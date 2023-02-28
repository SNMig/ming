package com.javabase.week1day6;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        String[] list = new String[1];
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用人员管理系统");
        while (true) {
            System.out.println("按1.查询所有员工名单");
            System.out.println("按2.新增员工");
            System.out.println("按3.删除员工名单");
            System.out.println("按4.更改员工名单");
            System.out.println("请输入数字");
            int inputNunber = scanner.nextInt();
            switch (inputNunber) {
                case 1:
                    listPut(list, size);
                    break;
                case 2:

                    list = addList(list, size);
                    System.out.println("新增成功");
                    size++;
                    break;
                case 3:
                    list = deleteList(list);
                    System.out.println("删除成功");
                    size--;
                    break;
                case 4:
                    list =raplace(list);
                    System.out.println("更改成功");
            }
        }
    }

    //打印所有员工
    static void listPut(String[] string, int size) {
        if (size == 0) {
            System.out.println("没有员工");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(string[i] + '\t');
            }
        }


    }

    //新增员工
    static String[] addList(String[] oldList, int size) {
        System.out.println("请输入新增员工的名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (size == oldList.length) {
            String[] newList = new String[oldList.length * 2];
            System.arraycopy(oldList, 0, newList, 0, oldList.length);
            oldList = newList;
        }
        oldList[size] = name;
        return oldList;
    }

    //删除员工
    static String[] deleteList(String[] List) {
        System.out.println("请输入要删除的员工姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String[] newList = new String[List.length - 1];
        int a = -1;
        for (int i = 0; i < List.length; i++) {
            if (List[i].equals(name)) {
                a = i;
                break;
            }
        }
        for (int i=0,j=0;i< List.length;i++){
            //int j=0;
            if (i==a){
                continue;
            }
            newList[j++]=List[i];
        }
        List=newList;
        return List;
    }

    //更改信息
    static String[] raplace(String[] list){
        System.out.println("请问要更改哪个名字 ");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.next();
        System.out.println("请输入要更改的名字");
        String newName=scanner.next();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(name)){
                list[i]=newName;
                break;
            }
        }
        return list;
    }
}
