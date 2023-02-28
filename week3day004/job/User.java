package com.javabase.week3day004.job;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private LocalDate birthdate;
    private LocalDateTime regtime;

    public User() {
    }

    public User(int id, String name, LocalDate birthdate, LocalDateTime regtime) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.regtime = regtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthdate, regtime);
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDateTime getRegtime() {
        return regtime;
    }

    public void setRegtime(LocalDateTime regtime) {
        this.regtime = regtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "birthdate=" + birthdate +
                ", regtime=" + regtime +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
