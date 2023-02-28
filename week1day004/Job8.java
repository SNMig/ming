package com.javabase.week1day004;

//*****************给定年限 月份打印日历******************
public class Job8 {
    public static void main(String[] args) {
        //给定年限 月份打印日历
        int thisYear = 2023;
        int thisMonth = 12;
        int totalDays = 0;
        for (int i = 1900; i < thisYear; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        //判断是否闰年,计算当前月份天数

        for (int j = 1; j < thisMonth; j++) {
            if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
                totalDays += 31;

            } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                totalDays += 30;

            } else {
                if (thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0) {
                    totalDays += 29;

                } else {
                    totalDays += 28;

                }
            }
        }
        int weekDate = totalDays % 7;
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        for (int i = 0; i < weekDate; i++) {
            System.out.print("\t");
        }
        int day=0;
        if (thisMonth == 1 || thisMonth == 3 || thisMonth == 5 ||thisMonth == 7 || thisMonth == 8 || thisMonth == 10 || thisMonth == 12) {
            day = 31;
        } else if (thisMonth == 4 || thisMonth== 6 || thisMonth == 9 ||thisMonth == 11) {
            day = 30;
        } else {
            if (thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }
        }
        for (int i = 1; i <= day; i++) {
            System.out.print(i + "\t");
            if ((i + weekDate) % 7 == 0) {
                System.out.println();
            }

        }


    }


}

