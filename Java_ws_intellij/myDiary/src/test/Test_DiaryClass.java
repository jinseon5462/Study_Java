package test;

import mydiary.Date;
import mydiary.Diary;

public class Test_DiaryClass {
    public static void main(String[] args) {
        Date d = new Date(2022, 11, 14);
        System.out.println(d.toString());

        Diary diary = new Diary(d, "test", "testtesttest");
        System.out.println(diary.toString());
        System.out.println("번호 : " + diary.getDno());
        System.out.println("날짜 : " + diary.getDate());
        System.out.println("제목 : " + diary.getTitle());
        System.out.println("내용 : " + diary.getContent());
    }
}
