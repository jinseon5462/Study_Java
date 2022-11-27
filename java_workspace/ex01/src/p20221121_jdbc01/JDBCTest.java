package p20221121_jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// 접속 객체 얻기 - 주소, 아이디, 패스워드
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String uid = "root";
		String upw = "1234";
		String driver = "org.mariadb.jdbc.Driver";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			if(conn != null) {
				System.out.println("db 접속 성공!");
			}else {
				System.out.println("db 접속 실패...");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("db접속에 필요한 클래스를(Driver)를 찾지 못했어요.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
