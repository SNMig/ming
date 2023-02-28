package com.javabase.week2day002;
//综合任务：仓库管理
//        1，声明类：产品 Product，其中属性：产品编号，产品名称，商品数量，价格
//        声明类：仓库：Repository，其中属性：产品数组，实现方法：

//        声明测试类：编写main方法，进行测试

import java.math.BigDecimal;

public class Product {
    private int productNumber;
    private String productName;
    private int productCounts;
    private BigDecimal productPrice;

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCounts() {
        return productCounts;
    }

    public void setProductCounts(int productCounts) {
        this.productCounts = productCounts;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}
