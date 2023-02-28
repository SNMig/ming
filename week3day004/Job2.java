package com.javabase.week3day004;
class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Job2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        Thread thread1 = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        thread1.start();
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
