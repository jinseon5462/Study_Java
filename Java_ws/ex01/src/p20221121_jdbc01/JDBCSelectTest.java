package p20221121_jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //DB접속
        Connection conn = null;
        //쿼리실행
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";

        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();

        String select_query = "SELECT * FROM test";
        rs = stmt.executeQuery(select_query);

        while(rs.next()) {
            System.out.print(rs.getInt("c1"));
            System.out.print(",");
            System.out.println(rs.getString("c2"));
        }
        rs.close();
        stmt.close();
        conn.close();

    }

}