package com.javabase.week2day005;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Job5 {
    public int priceRule(int n) {

        int price = 0;
        if (n <= 3 && n >= 0) {
            price = 3;
        } else if (n > 3 && n <= 5) {
            price = 4;
        } else if (n <= 8 && n > 5) {
            price = 4 + (n - 5) * 2;
        } else {
            price = 10;
        }


        return price;
    }
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        Job5 job5 = new Job5();
        Scanner scanner = new Scanner(System.in);
        map.put(1, "天府广场");
        map.put(2, "省体育馆");
        map.put(3, "倪家桥");
        map.put(4, "火车南站");
        map.put(5, "孵化园");
        map.put(6, "世纪城");
        map.put(7, "天府三街");
        map.put(8, "天府五街");
        map.put(9, "中和");

        for (Map.Entry<Integer, String> station : map.entrySet()) {
            System.out.println(station.getKey() + ":" + station.getValue());
        }

        int inSiteNo = 0;
        int outSiteNo = 0;
        String inSite;
        String outSite;

        while (true) {
            System.out.println("请输入上车站点");
            inSite = scanner.nextLine().trim();

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(inSite)) {
                    inSiteNo = entry.getKey();
                    break;
                }
            }

            if (inSiteNo == 0) {
                System.out.println("输入错误，请重新输入");
                continue;
            }

            System.out.println("请输入下车站点");
            outSite = scanner.nextLine().trim();

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(outSite)) {
                    outSiteNo = entry.getKey();
                    break;
                }
            }

            if (outSiteNo == 0) {
                System.out.println("输入错误，请重新输入");
                continue;
            }

            int a = Math.abs(inSiteNo - outSiteNo);
            int total = job5.priceRule(a);
            System.out.println("从" + inSite + "到" + outSite + "共有" + a + "个站收费" + total + "元，大概需要" + a * 2 + "分钟");
        }
    }
}
