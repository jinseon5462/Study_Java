package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String uid = "root";
		String upw = "1234";
		String driver = "org.mariadb.jdbc.Driver";
		System.out.print("삭제할 아이디를 입력하세요 : ");
		String deleteId = sc.nextLine();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			String query = "DELETE FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, deleteId);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
