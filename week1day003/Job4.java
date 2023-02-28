package com.javabase.week1day003;

public class Job4 {
    public static void main(String[] args) {
        int[] num={1,0,-3,6,8,9};
        for (int i=0;i<num.length;i++){
            if(num[i]%3==0){
                num[i]=num[i]/3;
            }
        }
        for (int n:num)
        System.out.println(n);
    }
}
