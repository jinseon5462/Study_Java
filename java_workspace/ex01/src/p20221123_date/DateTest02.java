package p20221123_date;

import java.sql.Timestamp;
import java.util.Date;

public class DateTest02 {
    public static void main(String[] args) {
        java.util.Date d1 = new java.util.Date();
        java.sql.Date d2 = new java.sql.Date(d1.getTime());

        System.out.println(d1);
        System.out.println(d2);

        Timestamp t = new Timestamp(d1.getTime());
        System.out.println(t);

        Date d = new Date();

        Timestamp t2 = new Timestamp(d.getTime());
        System.out.println(t2);
    }
}
