package p20221122_jdbc03;

import java.sql.*;

public class InsertTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";
        String id = "cccc";
        String pw = "c1234";
        String name = "홍씨";
        String tel = "010-0000-1234";



        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        String query = "INSERT INTO member (id, pw, name, tel)"
                + " VALUES (?, ?, ?, ?)";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        pstmt.setString(3, name);
        pstmt.setString(4, tel);

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("추가완료!");
        }else{
            System.out.println("추가 실패...");
        }
    }
}
