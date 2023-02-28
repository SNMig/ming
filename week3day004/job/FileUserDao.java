package com.javabase.week3day004.job;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static com.javabase.week3day004.job.UserData.userList;

public class FileUserDao implements UserDao {
    private String path;
    private DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public FileUserDao(String path) {
        this.path = path;
    }

    @Override
    public void add(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(user.toString());
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getById(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = reader.readLine()) != null) {
                User user = split(s);
                if (user.getId() == id) {
                    return user;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<User> getByName(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = reader.readLine()) != null) {
                User user = split(s);
                if (user.getName().equals(name)) {
                    userList.add(user);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void updateById(User user) {
        List<String> lines=new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = reader.readLine()) != null){
                User user1 = split(s);
                if (user1.getId()== user.getId()){
                    lines.add(formatUser(user));
                }else {
                    lines.add(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteById(int id) {
        List<String> lines=new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader(path))){
            String s;
            while ((s=reader.readLine())!=null){
                User user=split(s);
                if (user.getId()!=id){
                    lines.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    //*********************************************************


    //把读取的数据转换成User
    public User split(String s) {
        User user = new User();
        try {
            String[] str = s.split(",");
            int id = Integer.parseInt(str[0]);
            String name = str[1];
            LocalDate bitrdate = localDate(str[2]);
            LocalDateTime regtime = localDateTime(str[3]);

            user = new User(id, name, bitrdate, regtime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    //转换日期格式
    public LocalDate localDate(String s) {

        LocalDate localDate = LocalDate.parse(s, dateformatter);
        return localDate;
    }

    //转换具体时间
    public LocalDateTime localDateTime(String s) {

        LocalDateTime localDateTime = LocalDateTime.parse(s, datetimeformatter);
        return localDateTime;
    }
    //
    private String formatUser(User user){
        int id= user.getId();
        String name=user.getName();
        String birthDate=user.getBirthdate().format(dateformatter);
        String regtime=user.getRegtime().format(datetimeformatter);
        return String.format("%d,%s,%s,%s",id,name,birthDate,regtime);
    }
}
