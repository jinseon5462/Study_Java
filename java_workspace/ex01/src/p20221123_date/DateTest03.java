package p20221123_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
월은 대문자M, 분은 소문자m  HH대문자는 24시간제 소문자는 12시간제
 */
public class DateTest03 {
    public static void main(String[] args) {
        //날짜를 문자열로 바꾸기(형식 지정해서)
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");   // 중요
        System.out.println(sdf.format(today));

        String str_today = sdf.format(today);
        System.out.println(str_today);

        //문자열을 날짜로 바꾸기

        String date = "2022년 11월 23일 10시 13분 11초";

        try {
            Date d = sdf.parse(date);
            System.out.println(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
