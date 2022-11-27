package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		final String url = "jdbc:mariadb://localhost:3306/mydb";
		final String uid = "root";
		final String upw = "1234";
		final String driver = "org.mariadb.jdbc.Driver";
		
		String query = "SELECT * FROM member";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print("[아이디 : " + rs.getString("id"));
				System.out.print(", 비밀번호 : " + rs.getString("pw"));
				System.out.print(", 이름 : " + rs.getString("name"));
				System.out.println(", 전화번호 : " + rs.getString("tel") + "]");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
