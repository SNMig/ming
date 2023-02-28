package com.javabase.week2day002;

import java.math.BigDecimal;
import java.util.Scanner;

public class ReposityDaoTest {
    static RepositoryDao repositoryDao=new RepositoryDao(5);

    static Scanner scanner=new Scanner(System.in);

    static Product inputProduct(){
        Product newproduct=new Product();
        System.out.println("请输入产品编号");
        newproduct.setProductNumber(scanner.nextInt());
        System.out.println("请输入产品名称");
        newproduct.setProductName(scanner.next());
        System.out.println("请输入产品数量");
        newproduct.setProductCounts(scanner.nextInt());
        System.out.println("请输入产品价格");
        newproduct.setProductPrice(scanner.nextBigDecimal());
        return newproduct;
    }

    static void add(){
        String s;
        do {
            Product newproduct=inputProduct();
            boolean a =repositoryDao.addProduct(newproduct);
            if (a){
                System.out.println("入库成功");
            }else {
                System.out.println("无法入库");
            }
            System.out.println("是否继续入库y/n");
            s=scanner.next();
        }while (s.equals("y"));
    }

    public static void main(String[] args) {

        System.out.println("欢迎使用仓库管理系统");
        while (true){
            System.out.println("按1.盘点");
            System.out.println("按2.入库");
            System.out.println("按3.出库");
            System.out.println("按4.查询商品");
            System.out.println("请输入相应的数字");
            int opr=scanner.nextInt();
            switch (opr){
                case 1:
                    repositoryDao.printinfomatio();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    String out;
                    do {
                        System.out.println("输入要出库的名字");
                        String name=scanner.next();
                        System.out.println("输入要出库数量");
                        int nums=scanner.nextInt();
                        boolean b =repositoryDao.outProduct(name,nums);
                        if (b){
                            System.out.println("出库成功");
                        }else {
                            System.out.println("无法出库");
                        }
                        System.out.println("是否继续出库y/n");
                        out=scanner.next();
                    }while (out.equals("y"));

                    break;
                case 4:
                    Product product4=new Product();
                    System.out.println("输入查询的名字");
                    String name=scanner.next();
                    product4=repositoryDao.search(name);
                    if (product4==null){
                        System.out.println("查询不到");
                    }else {
                        repositoryDao.print(product4);
                        System.out.print(product4.getProductPrice());
                    }
                    break;
            }
        }
    }
}
