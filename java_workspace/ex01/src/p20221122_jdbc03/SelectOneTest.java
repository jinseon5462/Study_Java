package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectOneTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("조회할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String uid = "root";
		String upw = "1234";
		String driver = "org.mariadb.jdbc.Driver";
		
		String query = "SELECT * FROM member WHERE id = ?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id"));
				System.out.print(", ");
				System.out.print(rs.getString("pw"));
				System.out.print(", ");
				System.out.print(rs.getString("name"));
				System.out.print(", ");
				System.out.println(rs.getString("tel"));
			}
			if(!rs.next()) {
				System.out.println("일치하는 정보가 없습니다.");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
