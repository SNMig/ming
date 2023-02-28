package com.javabase.week3day003;

import java.io.*;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Job4 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader("F:\\新建文件夹\\新建文本文档.txt"))){
            String s=null;
            while ((s= reader.readLine())!=null){
                list.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
       //list=list.stream().sorted(String::compareTo).collect(Collectors.toList());
        list.sort((list1,list2)->list1.length()-list2.length());
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("F:\\新建文件夹\\新建文本文档.txt"))){
            for (String s1 : list) {
                writer.write(s1);
                writer.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
