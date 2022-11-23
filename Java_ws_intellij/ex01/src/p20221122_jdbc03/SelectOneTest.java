package p20221122_jdbc03;

import java.sql.*;

public class SelectOneTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";

        String selectOneQuery = "SELECT * FROM member WHERE name = '곽두팔'";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();

        rs = stmt.executeQuery(selectOneQuery);

        while(rs.next()){
            System.out.print(rs.getString("id"));
            System.out.print(", ");
            System.out.print(rs.getString("pw"));
            System.out.print(", ");
            System.out.print(rs.getString("name"));
            System.out.print(", ");
            System.out.println(rs.getString("tel"));
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
