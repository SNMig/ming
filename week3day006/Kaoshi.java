package com.javabase.week3day006;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//编写方法，参数为文件夹名及文件名，实现将文件剪切到文件夹中。若该文件夹中存在同名的文件，则在文件名后面增加表示当前时间的字符串（如202302251032）
public class Kaoshi {
    public void cut(String fileName, String wenjianName) {
        File file1 = new File(fileName);
        File filewenjian = new File(wenjianName);
        if (!filewenjian.exists()) {
            filewenjian.mkdir();
        } else {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String time = simpleDateFormat.format(new Date());
            File file = new File(filewenjian, file1.getName()+time);
            file1.renameTo(file);
        }
    }
}
