package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectOneLikeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String uid = "root";
		String upw = "1234";
		String driver = "org.mariadb.jdbc.Driver";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			String query = "SELECT * FROM member WHERE name LIKE ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + name + "%");
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
