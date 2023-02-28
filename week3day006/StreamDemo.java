package com.javabase.week3day006;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Company> list = new ArrayList<Company>();
        list.add(new Company(1, "阿里巴巴", "马云", 1999));
        list.add(new Company(2, "淘宝", "马云", 2003));
        list.add(new Company(3, "华为", "任正非", 1987));
        list.add(new Company(4, "小米", "雷军", 2010));
        list.add(new Company(5, "雷人科技", "邓强", 2018));
        list.add(new Company(6, "蜗牛学苑", "邓强", 2015));
        list.add(new Company(7, "腾讯", "马化腾", 1998));
        list.add(new Company(8, "百度", "李彦宏", 2000));
        //此处开始答题
        //1、找出马云创建的公司,并输出
        list.stream().filter(lists -> lists.getBoss().equals("马云"))
                .map(lists -> lists.getName())
                .forEach(System.out::println);

        //2、邓强创建了几家公司?

        double total = list.stream().filter(n -> n.getBoss().equals("邓强"))
                .count();

        System.out.println(total);
        //3、马云历次创建公司的最早年份
        System.out.println("********************");
        list.stream().filter(n -> n.getBoss().equals("马云"))

                .sorted(Comparator.comparing(n -> n.getYear()))
                .forEach(System.out::println);
        //4、给所有公司按创建年份降序输出
        list.stream().sorted((n1, n2) -> n2.getYear() - n1.getYear())
                .forEach(System.out::println);


        //5、把所有老板名字收集到一个集合中,且不可重复
        list.stream().map(n->n.getBoss())
                .distinct()
                .collect(Collectors.toList());

    }
}
