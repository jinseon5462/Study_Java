package p20221123_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) throws ParseException {
        String date1 = "20221123";
        String date2 = "20220930";

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        /* Date타입으로 변경 */

        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);
        long Sec = (d1.getTime() - d2.getTime()) / 1000;    //초
        long Min = (d1.getTime() - d2.getTime()) / 60000;   //분
        long Hour = (d1.getTime() - d2.getTime()) / 3600000;   //시
        long Days = Sec / (24 * 60 * 60);   // 일자

        System.out.println(Sec + "초 차이");
        System.out.println(Min + "분 차이");
        System.out.println(Hour + "시 차이");
        System.out.println(Days + "일 차이");
    }
}
