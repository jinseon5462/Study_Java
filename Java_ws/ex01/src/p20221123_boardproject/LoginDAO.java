package p20221123_boardproject;

import java.sql.*;

public class LoginDAO {
    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";

    Connection conn;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Connection dbConnect() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        return conn;

    }

    public void loginCheck() throws SQLException, ClassNotFoundException {
        dbConnect();
        stmt = conn.createStatement();
        String loginCheck_query = "SELECT * FROM managerlogin WHERE ";
        rs = stmt.executeQuery(loginCheck_query);
    }
}
