package com.javabase.week3day004;

public class BankAcountTest {
    public static void main(String[] args) {
        BankAcount Tom=new BankAcount(1000.0);
        Thread threadDepoit=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                Tom.depoist(100);
                System.out.println("存入100成功"+Tom.getMoney());
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        Thread threadWithdraw=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                Tom.withdraw(100);
                System.out.println("取出100成功"+Tom.getMoney());
                try{
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        threadDepoit.start();
        threadWithdraw.start();
    }
}
