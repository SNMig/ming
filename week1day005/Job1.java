package com.javabase.week1day005;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        //int a=add(18,3,'/');
        while (true){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1=scanner.nextInt();
        System.out.println("请输入第二个数字");
        int number2=scanner.nextInt();
        System.out.println("请输入想要的运算");
        char ch=scanner.next().charAt(0);
        int res=add(number1,number2,ch);
        System.out.println(res);
        }

    }


    static int add(int num1,int num2,char cha){
        int a=0;
        if (cha=='+'){
            a=num1+num2;
        } else if (cha=='-') {
            a=num1-num2;
        } else if (cha=='*') {
            a=num1*num2;
        }else if (cha=='/'){
            a=num1/num2;
        }
        return a;
    }
}
