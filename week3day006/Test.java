package com.javabase.week3day006;

import java.io.File;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

            //Class s = Student.class;
            Class s=Class.forName("D:\\javaxunlian\\project1\\src\\main\\java\\com\\javabase\\week3day006\\Student.java");
            Field[] files=s.getDeclaredFields();
            for (Field file : files) {
                System.out.println(file.getName());
            }

    }


}
