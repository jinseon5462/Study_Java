package p20221123_boardproject;

import java.sql.*;

public class LoginDAO {
    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Connection dbConnect() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        return conn;
    }


    public int loginCheck(String id, String pw) throws SQLException, ClassNotFoundException {
        dbConnect();
        String loginCheck_query = "SELECT COUNT(*) FROM managerlogin WHERE id = ? AND pw = ?";
        pstmt = conn.prepareStatement(loginCheck_query);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        rs = pstmt.executeQuery();
        rs.next();
        int loginResult = rs.getInt(1);
        return loginResult;
    }

    public int gradeCheck(String id, String pw) throws SQLException, ClassNotFoundException {
        dbConnect();
        String gradeCheck_query = "SELECT * FROM managerlogin WHERE id = ? AND pw = ?";
        pstmt = conn.prepareStatement(gradeCheck_query);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        rs = pstmt.executeQuery();
        rs.next();
        if(rs.getString("grade").equals("master")){
            return 1;
        }else{
            return 0;
        }
    }
}
