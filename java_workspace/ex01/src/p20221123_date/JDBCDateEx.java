package p20221123_date;

import java.sql.*;

public class JDBCDateEx {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, uid, upw);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dateex");

            rs.next();
            // dateex 테이블의 d1열의 데이터를 java에서 어떤 타입으로 받을 수 있나.

            java.util.Date d1_1 = rs.getDate("d1");
            java.sql.Date d1_2 = rs.getDate("d1");
            String d1_3 = rs.getString("d1");
            java.sql.Timestamp d1_4 = rs.getTimestamp("d1");
            java.util.Date d1_5 = rs.getTimestamp("d1");

            java.sql.Timestamp d2_1 = rs.getTimestamp("d2");
            String d2_2 = rs.getString("d2");
            java.util.Date d2_3 = rs.getDate("d2");

            System.out.println(d1_1);
            System.out.println(d1_2);
            System.out.println(d1_3);
            System.out.println(d1_4);
            System.out.println(d1_5);
            System.out.println("----------------------");
            System.out.println(d2_1);
            System.out.println(d2_2);
            System.out.println(d2_3);
            /*
            rs.getDate("d1");
            rs.getTimestamp("d2");
            rs.getString("d1");
            rs.getString("d2");
            rs.getTimestamp("d1");
            rs.getDate("d2");
             */
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
