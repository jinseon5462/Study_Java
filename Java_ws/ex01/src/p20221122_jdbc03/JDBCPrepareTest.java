package p20221122_jdbc03;

import java.sql.*;

public class JDBCPrepareTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. DB 접속
        // 2. 쿼리 실행

        Connection conn = null; // 접속 객체

        PreparedStatement pstmt = null;

        Statement stmt = null;  // 쿼리실행 객체

        ResultSet rs = null;    // 결과 집합객체(select할때만 필요)

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String id = "zzz";
        String pw = "z234";
        String name = "장씨";
        String tel = "010-7777-7777";

        Class.forName("org.mariadb.jdbc.Driver");
        conn = DriverManager.getConnection(url, uid, upw);
        //stmt = conn.createStatement();
            /*
            String query = "INSERT INTO member (id, pw, name)"
                            + " VALUES ('"
                            + id + "', '"
                            + pw + "', '"
                            + name + "')";
             */
        String query = "INSERT INTO member (id, pw, name, tel)"
                + " VALUES (?, ?, ?, ?)";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        pstmt.setString(3, name);
        pstmt.setString(4, tel);

        int result = pstmt.executeUpdate();
        //int result = stmt.executeUpdate(query);
        System.out.println("result : " + result);

        String query2 = "SELECT * FROM member where id = ?";
        pstmt = conn.prepareStatement(query2);
        pstmt.setString(1, "ffff");
        rs = pstmt.executeQuery();

        while(rs.next()){
            System.out.print(rs.getString("id"));
            System.out.print(", ");
            System.out.print(rs.getString("pw"));
            System.out.print(", ");
            System.out.print(rs.getString("name"));
            System.out.print(", ");
            System.out.println(rs.getString("tel"));

        }
    }
}
