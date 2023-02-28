package com.javabase.week2day005;
/**
 * 1）地铁站编号和站名对应关系如下：
 * 1=天府广场
 * 2=省体育馆
 * 3=倪家桥
 * 4=火车南站
 * 5=孵化园
 * 6=世纪城
 * 7=天府三街
 * 8=天府五街
 * //....
 * 将以上对应关系的数据存储到map集合中，key：表示站编号，value：表示站名（不重复），并遍历打印(可以不按顺序打印)
 * <p>
 * ​    2）.计算地铁票价规则：
 * ​       总行程 3站内（包含3站）收费3元，
 * ​            3站以上但不超过5站（包含5站）的收费4元，
 * ​            5站以上的，在4元的基础上，每多1站增加2元，
 * ​            10元封顶；
 * <p>
 * 3）打印格式（需要对键盘录入的上车站和到达站进行判断，如果没有该站，提示重新输入，直到站名存在为止）
 * <p>
 * ​       注意：每站需要2分钟
 * ​       请输入上车站：科技馆
 * ​       您输入的上车站：科技馆 不存在，请重新输入上车站： 天府广场
 * ​       请输入到达站：科技馆
 * ​       您输入的到达站：科技馆 不存在，请重新输入到达站： 孵化园
 * <p>
 * ​       从天府广场到孵化园共经过4站收费4元，大约需要 8分钟
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Job3 {


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

        Job3 job3 = new Job3();
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
            inSite = scanner.next();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {

                if (entry.getValue().equals(inSite)) {
                    inSiteNo = entry.getKey();
                    break;
                }
            }
            if (inSiteNo == 0) {
                System.out.println("输入错误");
                break;
            }
            System.out.println("请输入下车站点");
            outSite = scanner.next();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {

                if (entry.getValue().equals(outSite)) {
                    outSiteNo = entry.getKey();
                    break;
                }
            }
            if (outSiteNo == 0) {
                System.out.println("输入错误");
                break;
            }


            int a = Math.abs(inSiteNo - outSiteNo);
            int total = job3.priceRule(a);
            System.out.println("从" + inSite + "到" + outSite + "共有" + a + "个站收费" + total + "元，大概需要" + a * 2 + "分钟");
        }

    }
}

