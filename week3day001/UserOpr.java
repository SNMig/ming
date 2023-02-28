package com.javabase.week3day001;

import java.util.Comparator;

public class UserOpr {
    public static int compare(Comparator<User> comparator, User user1, User user2) {
        if (comparator.compare(user1, user2) > 0) {
            return 1;
        } else if (comparator.compare(user1, user2) < 0) {
            return -1;
        } else {
            return 0;
        }
//        if (user1.getAge() > user2.getAge()) {
//            return 1;
//        } else if (user1.getAge() < user2.getAge()) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
