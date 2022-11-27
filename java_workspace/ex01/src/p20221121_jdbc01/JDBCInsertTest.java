package p20221121_jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertTest {
	public static void main(String[] args) {
		//1. DB 접속 (Connection) 준비
		Connection conn = null;
		//2. 쿼리 실행(Statement) 준비
		Statement stmt = null;
		//DB접속을 위한 주소, 아이디, 패스워드 준비
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String uid = "root";
		String upw = "1234";
		String driver = "org.mariadb.jdbc.Driver";
		
		String query = "INSERT INTO test (c1, c2) VALUES (10, 'Jane')";
		
		//DB접속을 위한 클래스 로드(driver)
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(query);
			if(result == 1) {
				System.out.println("추가완료");
			}else {
				System.out.println("추가실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
