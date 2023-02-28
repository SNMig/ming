package com.javabase.week2day002;

//        构造方法：两个，其中一个无参，存储产品种类默认10，另一个构造方法有一个参数，表示种类数


import java.math.BigDecimal;

public class RepositoryDao {
    private Product[] products;

    public RepositoryDao() {
        this(10);
    }

    public RepositoryDao(int capcity) {
        products = new Product[capcity];
    }

    private int sizes;

    //盘点：打印所有产品信息
    public void printinfomatio() {
        if (sizes == 0) {
            System.out.println("仓库为空");
        } else {
            for (int i = 0; i < sizes; i++) {
                print(products[i]);
            }
        }
    }

    public void print(Product product) {
        System.out.println(product.getProductName() + product.getProductCounts());
    }

    //入库 ：先去判断是否存在该产品，如果存在，直接更新数量，如果没有：仓库是否已满，如果慢了，没法入库，没有慢，新增产品
    public boolean addProduct(Product product) {
        for (int i = 0; i < sizes; i++) {
            if (products[i].equals(product)) {
                products[i].setProductCounts(product.getProductCounts() + product.getProductCounts());
                return true;
            }

        }
        if (sizes == 10) {
            return false;
        }
        products[sizes++] = product;
        return true;


    }

    //出库：根据产品的名称及数量进行出库，查询产品是否存在，不存在没法出库，产品存在，判断库存是否足够，库存不够不允许出库，库存足够，直接减少该产品的数量
    public boolean outProduct(String name, int num) {
        if (name == null) {
            return false;
        }
        if (num <= 0) {
            return  false;
        }
        for (int i = 0; i < sizes; i++) {
            if (products[i].getProductName().equals(name)) {
                if (products[i].getProductCounts() >=num) {
                    products[i].setProductCounts(products[i].getProductCounts() - num);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    //        查询：根据产品名查询所有的产品信息，支持模糊查找
    public Product search(String name) {

        for (int i = 0; i < sizes; i++) {
            if (products[i].getProductName().contains(name)) {
                return products[i];
            }
        }
        return null;
    }


    //总金额
    public BigDecimal totalPrice(Product product) {
        BigDecimal total;
        BigDecimal money=new BigDecimal(0);
        for (Product product1 : products) {
            total = product1.getProductPrice().multiply(new BigDecimal(product1.getProductCounts()));
            money=money.add(total);
        }
        return money;

    }
}
