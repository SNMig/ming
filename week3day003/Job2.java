package com.javabase.week3day003;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Job2 {
    public static List<File> getFiles(String path) throws Exception {
        if (path == null || path.trim().equals("")) {
            throw new IllegalArgumentException("路径不能为空");
        }
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        List<File>files=new ArrayList<>();
        if (file.isFile()) {
            files.add(file);
        } else {
            File[] files1=file.listFiles();
            for (File file1 : files1) {
                files.addAll(getFiles(file1.getAbsolutePath()));
            }
        }


        return files;
    }

    public static void main(String[] args) throws Exception {
        List<File> S=getFiles("D:\\javaxunlian\\project1");
        //S.forEach(System.out::println);
        S.forEach(n-> System.out.println(n));
    }
}
