package com.javabase.week3day002;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*



 */
public class Job2 {
    public static void main(String[] args) {


    }
    //1、声明方法，获取目录中所有的jpg图片
    public List<File> getPicture(String path){
        File file=new File(path);
        File[] files=file.listFiles();
        List<File>fileList=new ArrayList<>();
        for (File file1 : files) {
            if (file1.getName().endsWith(".jpg")){
                fileList.add(file1);
            }
        }
        return fileList;

    }
    //2、声明方法，删除指定的文件夹（不包含子文件夹）
    public void deletew(String path){
        File file=new File(path);
        boolean exists= file.exists();
        if (!exists){
            return;
        }
        if (file.listFiles().length>0){

            return;
        }
        file.delete();

    }
    //3、声明方法，将文件移动到指定的文件夹，目标文件夹不存在，则创建之
    public void move(String path,String name,String targetpath){
        File file1=new File(path);
        File file2=new File(targetpath,name);
        if (!file2.exists()){
            file2.mkdir();
        }else {
            File file=new File(file2,file1.getName());
            file1.renameTo(file);
        }

    }
}
