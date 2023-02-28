package com.javabase.week3day003;

public class Job1 {
    public static int sum(int num){
        if (num==1){
            return 1;
        }
        if (num==2){
            return 1;
        }
        return sum(num-1)+sum(num-2);


    }

    public static void main(String[] args) {
        System.out.println(sum(8));
    }
}
