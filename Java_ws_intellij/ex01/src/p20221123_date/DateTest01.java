package p20221123_date;

import java.util.Calendar;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date d = new Date();    // 현재시간
        System.out.println(d);

        long now = d.getTime();
        System.out.println(now);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeInMillis());
        System.out.println(c);
        c.set(2022, 10, 23);    // 캘린더클래스를 사용할때는 0월부터 시작한다.
        d = c.getTime();                            // 그렇기때문에 11월이면 10월을 넣어야한다.
        long today = d.getTime();
        System.out.println(d);

        Calendar c2 = Calendar.getInstance();
        c2.set(2022, 8, 30);
        long startday = c2.getTimeInMillis();
        long diff = today - startday;
        System.out.println(diff);
        System.out.println(diff/(1000*60*60*24));
    }
}
