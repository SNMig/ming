package com.javabase.week3day003;

import java.io.*;

public class Job3 {
    public static void main(String[] args) {
        try (InputStream inDoc=new FileInputStream("E:\\下载\\使用电子票据（发票）申请报销承诺书.docx");
            OutputStream outDoc=new FileOutputStream("E:\\下载\\新建文件夹\\使用电子票据（发票）申请报销承诺书.docx")) {
            byte[] b = new byte[1024];
            int length = 0;
            while ((length = inDoc.read(b, 0, b.length)) != -1) {
                outDoc.write(b, 0, b.length);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
