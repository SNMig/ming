package com.javabase.week2day002;

import java.math.BigDecimal;

public class RepositoryDaoEx {


    private Product[] products;
    private int size;

    public RepositoryDaoEx() {
        this(10);
    }

    public RepositoryDaoEx(int capcity) {
        products = new Product[capcity];
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            printProduct(products[i]);
        }
    }

    public int size() {
        int num = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                num++;
            }
        }
        return num;
    }


    public void printProduct(Product product) {
        if (product != null) {
            System.out.println(product.getProductNumber() + "," + product.getProductName() + "," + product.getProductCounts() + "," + product.getProductPrice());
        }
    }

    /**
     * 入库，先去判断是否存在该产品，如果存在，直接更新数量，
     * 如果没有：仓库是否已满，如果满了，没法入库，没有满，新增产品
     *
     * @param product
     */
    public boolean in(Product product) {
        if (product == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (product.getProductName().equals(products[i].getProductName())) {
                products[i].setProductCounts(products[i].getProductCounts() + product.getProductCounts());  //更新数量
                return true;
            }
        }
        if (size == products.length) {
            return false;
        }
        products[size++] = product;
        return true;

    }

    /**
     * 出库，根据产品的名称及数量进行出库，查询产品是否存在，不存在没法出库，产品存在，
     * 判断库存是否足够，库存不够不允许出库，
     * 库存足够，直接减少该产品的数量
     *
     * @param name
     * @param num
     */
    public void out(String name, int num) {
        if (name == null) {
            return;
        }
        if (num <= 0) {
            return;
        }
        boolean exist = false;
        for (int i = 0; i < size; i++) {
            if (name.equals(products[i].getProductName())) {
                if (products[i].getProductCounts() >= num) {
                    products[i].setProductCounts(products[i].getProductCounts() - num);
                    System.out.println("出库成功");
                    exist = true;
                } else {
                    System.out.println("库存不足");
                }
            }
        }
        if (!exist) {
            System.out.println("不存在");
        }


    }

    public Product[] get(String name) {
        Product[] products1 = new Product[size];
        for (int i = 0; i < size; i++) {
            if (products[i].getProductName().contains(name)) {
                products1[i] = products[i];
            }
        }
        return products1;
    }

    //    计算仓库中所有产品的总金额
    public BigDecimal getTotalMoney() {
        BigDecimal money = new BigDecimal("0"); //构造方法使用String才是精确的

        for (int i = 0; i < size; i++) {
            BigDecimal b = products[i].getProductPrice().multiply(new BigDecimal(products[i].getProductCounts()));
            money = money.add(b);
        }

        return money;
    }

    //对产品按照各自的总金额降序排列
    public Product[] sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                BigDecimal money1 = products[j].getProductPrice().multiply(new BigDecimal(products[j].getProductCounts()));
                BigDecimal money2 = products[j + 1].getProductPrice().multiply(new BigDecimal(products[j + 1].getProductCounts()));

                if (money1.compareTo(money2) == -1) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        return products;
    }


}
