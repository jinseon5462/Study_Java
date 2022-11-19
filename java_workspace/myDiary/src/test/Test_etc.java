package test;

import mydiary.Date;

public class Test_etc {
    public static void main(String[] args) {
        String str = "2022/11/13";
        String[] temp = str.split("/");

        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);

        Date date = new Date(year, month, day);
        System.out.println(date);
    }
}
