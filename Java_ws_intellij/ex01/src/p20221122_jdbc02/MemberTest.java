package p20221122_jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberTest {
    public static void main(String[] args) {
        //MemberVO 객체 생성
        MemberVO member = new MemberVO("lee", "1111", "이진선", "010-2595-5462");
        Connection conn = null;
        Statement stmt = null;
        String insert_query = "INSERT INTO member (id, pw, name, tel) VALUES ('" + member.getId() + "', '" + member.getPw() + "', '" + member.getName() + "', '" + member.getTel() + "')";

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, uid, upw);
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(insert_query);
            if(result == 1) {
                System.out.println("추가 성공!");
            }else {
                System.out.println("추가 실패...");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = null;
        String select_query = "SELECT * FROM member";
        try {
            rs = stmt.executeQuery(select_query);

            while(rs.next()) {
                System.out.print(rs.getString("id"));
                System.out.print(", ");
                System.out.print(rs.getString("pw"));
                System.out.print(", ");
                System.out.print(rs.getString("name"));
                System.out.print(", ");
                System.out.println(rs.getString("tel"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}