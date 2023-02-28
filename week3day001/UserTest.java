package com.javabase.week3day001;

import java.util.Comparator;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Tom", 20);
        User user2 = new User("Jack", 21);

        if (user1.compareTo(user2) > 0) {

        } else if (user1.compareTo(user2) < 0) {

        } else {

        }

        UserOpr.compare(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }, user1, user2);

        UserOpr.compare((User u1, User u2) -> u1.getAge() - u2.getAge(), user1, user2);

    }
}
