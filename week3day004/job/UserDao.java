package com.javabase.week3day004.job;

import com.javabase.week3day004.job.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    User getById(int id);
    List<User> getByName(String name);
    void updateById(User user);
    void deleteById(int id);
}
