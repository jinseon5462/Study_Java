package testtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test2 {
	public static void main(String[] args) {
		final String url = "jdbc:mariadb://localhost:3306/mydb";
		final String uid = "root";
		final String upw = "1234";
		final String driver = "org.mariadb.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			String query = "INSERT INTO boardtest (bno, title, content, writer, date, view)"
					+ " VALUES ((SELECT IFNULL(MAX(bno) + 1, 1) FROM boardtest bt), 4, 4, 4, NOW(), 0)";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(query);
			if(result == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}