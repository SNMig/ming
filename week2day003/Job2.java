package com.javabase.week2day003;


import java.math.BigDecimal;
import java.util.Objects;

class Computer{
    private String name;
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Computer computer = (Computer) o;
        return Objects.equals(name, computer.name) && Objects.equals(price, computer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}



public class Job2 {
    public static void main(String[] args) {
        Computer computer1=new Computer();
        computer1.setName("华为");
        computer1.setPrice(new BigDecimal(9999));

        Computer computer2=new Computer();
        computer1.setName("华为");
        computer1.setPrice(new BigDecimal(9999));

        System.out.println(computer1==computer2);
        System.out.println(computer1.equals(computer2));

    }
}
