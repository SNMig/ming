package com.javabase.week1day003;

public class Job6 {
    public static void main(String[] args) {
        String[] str={"张三","张三丰","李四","王张"};
        boolean find=true;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()==2&&str[i].charAt(0)=='张'){
                System.out.println(str[i]);
            }
        }
    }
}
