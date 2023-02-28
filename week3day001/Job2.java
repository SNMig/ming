package com.javabase.week3day001;

@FunctionalInterface
interface Interface1 {
    void test();
}

interface Interface2 {
    void test(int num);
}

interface Interface3 {
    void test(int num1, int num2);
}

interface Interface4 {
    int test(int num1, int num2);
}
public class Job2 {
    public static void main(String[] args) {
        Interface1 interface1 = () -> {
            int num = 10;
            System.out.println(num+"1");
        };
        Interface2 interface2 = (num1) -> {
            System.out.println(num1+"2");
        };

        interface2.test(300);
        interface2.test(100);
        Interface2 interface21 = num1 -> System.out.println(num1+"3");
        interface21.test(200);

        Interface3 interface3 = (num1, num2) -> {
            System.out.println(num1 + num2+"4");
        };
        interface3.test(100, 200);

        Interface4 interface4 = (num1, num2) -> {
            return num1 + num2;
        };
        Interface4 interface41 = (num1, num2) -> num1 + num2;

    }
}
