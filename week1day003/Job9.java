package com.javabase.week1day003;

public class Job9 {
    public static void main(String[] args) {
        //2、计算1-100之间的整数之和，当和达到500时终止，输出此时的整数多少
        double total=0;
        double a=0;
        for (int i=1;i<101;i++){
            total+=i;
            if(total>501){
                a=i;
                System.out.println(a);
                break;
            }
        }
        //System.out.println(a);
        //System.out.println(total);
    }
}
