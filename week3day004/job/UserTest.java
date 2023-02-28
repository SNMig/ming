package com.javabase.week3day004.job;

import jdk.internal.org.objectweb.asm.commons.Method;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Properties;

//使用属性文件配置要有的UserDAO实现类，属性文件内容格式如下：
//        userimpl=com.woniuxy.job.FileUserDAO
//        通过反射获取实现类进行测试
public class UserTest {
    public static void main(String[] args) throws Exception{

        Properties props = new Properties();
        try(InputStream is = UserTest.class.getClassLoader().getResourceAsStream("com/javabase/week3day004/job/config.properties")){
        props.load(is);
        is.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        // 获取DAO实现类名并创建实例
        String daoClassName = props.getProperty("userimpl");
        Class<?> daoClass = Class.forName(daoClassName);
        UserDao dao = (UserDao) daoClass.newInstance();


        dao.add(new User(1,"张三", LocalDate.of(1990,1,1), LocalDateTime.now()));
        dao.add(new User(2,"李四", LocalDate.of(1995,2,2), LocalDateTime.now()));
        dao.add(new User(3,"王五六", LocalDate.of(1998,3,3), LocalDateTime.now()));
        dao.add(new User(4,"张李强", LocalDate.of(1990,4,1), LocalDateTime.now()));
        System.out.println(dao.getById(1));
        System.out.println(dao.getByName("张三"));

    }
}
