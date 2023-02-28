package com.javabase.week3day004;

import java.util.concurrent.TimeUnit;

public class Job4 {
    public  synchronized void test1(){
        System.out.println(Thread.currentThread().getName()+":test1");
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void test2(){
        System.out.println(Thread.currentThread().getName()+":test2");
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Job4 safe=new Job4();
        new Thread(()->{
            safe.test1();
        }).start();
        new Thread(()->{
            safe.test1();
        }).start();
    }
}
