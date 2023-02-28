package com.javabase.week1day003;

public class Job5 {
    public static void main(String[] args) {
        String s="abinjftjsoeiondkfhmn";
        int num=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                num++;
            }
        }
        System.out.println("共有"+num+"个元音");
    }
}
