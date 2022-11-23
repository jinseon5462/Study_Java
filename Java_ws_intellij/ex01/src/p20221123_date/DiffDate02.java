package p20221123_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DiffDate02 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        Date d2 = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //String d1_1 = sdf.format(d1);
        //System.out.println(d1_1);

        Calendar c = Calendar.getInstance();
        c.set(2022,10,23, 0, 0, 1);  // 11월 23일

        Calendar c2 = Calendar.getInstance();
        c2.set(2022,10,22, 0, 0, 0);

        d1 = c.getTime();
        d2 = c2.getTime();
        String d1_1 = sdf.format(d1);
        String d2_1 = sdf.format(d2);

        Date d1_2 = sdf.parse(d1_1);
        Date d2_2 = sdf.parse(d2_1);

        long now = d1.getTime();
        long start = d2.getTime();

        long diff = now - start;

        long Sec = diff / 1000; //초
        long Min = diff / (60 * 1000); //분
        long Hour = diff / 3600000; //시
        long Days = Sec / (24 * 60 * 60); //일

        System.out.println(Sec + "초 차이");
        System.out.println(Min + "분 차이");
        System.out.println(Hour + "시 차이");
        System.out.println(Days + "일 차이");
    }
}
