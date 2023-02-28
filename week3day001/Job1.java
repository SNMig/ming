package com.javabase.week3day001;
/*
利用接口做参数，写个计算器，能完成加减乘除运算。
（1）定义一个接口Computable含有一个方法int computer(int n, int m)。
（2）设计四个类分别实现此接口，完成加减乘除运算。
（3）设计一个类UseCompute，类中含有方法：public int useCom(Computable com, int one, int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
 */
public class Job1{
    public static void main(String[] args) {
        UseCompute useCompute=new UseCompute();
        System.out.println(useCompute.useCom(new Puls(),3,4));
    }

}
interface Computable {
    int computer(int n,int m);
}
class Puls implements Computable{

    @Override
    public int computer(int n, int m) {
        return n+m;
    }
}
class Minus implements Computable{

    @Override
    public int computer(int n, int m) {
        return n-m;
    }
}
class Multiply implements Computable{

    @Override
    public int computer(int n, int m) {
        return n*m;
    }
}
class Divide implements Computable{

    @Override
    public int computer(int n, int m) {
        return n/m;
    }
}
class UseCompute{
    int useCom(Computable com, int one, int two) {
        return com.computer(one,two);
    }

}
