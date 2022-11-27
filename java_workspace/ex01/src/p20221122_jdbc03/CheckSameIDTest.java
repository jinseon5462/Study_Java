package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckSameIDTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String loginId = sc.nextLine();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		final String url = "jdbc:mariadb://localhost:3306/mydb";
		final String uid = "root";
		final String upw = "1234";
		final String driver = "org.mariadb.jdbc.Driver";
		String query = "SELECT COUNT(id) cnt FROM member WHERE id = ?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, loginId);
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getInt("cnt") == 1) {
				System.out.println("중복된 아이디입니다.");
			}else {
				System.out.println("사용가능한 아이디입니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
