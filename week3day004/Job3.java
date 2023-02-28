package com.javabase.week3day004;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Job3 {
    static int num=0;
    static List<String>names=new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        int count=10;
        CountDownLatch cdl=new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(()->{
                num++;
                names.add("");

                cdl.countDown();
            }).start();
        }
        cdl.await();  //阻塞，当数减为0时继续执行
        System.out.println(num);
        System.out.println(names.size());
    }
}
