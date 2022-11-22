package p20221122_jdbc03;

import java.sql.*;

public class SelectAllMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";
        String selectAll_query = "SELECT * FROM member";

        //MemberVO m = new MemberVO("kimkim", "2222", "김명팔", "010-2342-8328");

        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(selectAll_query);

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
