package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	
	final String url = "jdbc:mariadb://localhost:3306/mydb";
	final String uid = "root";
	final String upw = "1234";
	final String driver = "org.mariadb.jdbc.Driver";
	
	public Connection dbConnect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insert(BoardVO board) {
		dbConnect();
		String query = "INSERT INTO boardtest (bno, title, content, writer, date, view)"
			+ " VALUES ((SELECT IFNULL(MAX(bno) + 1, 1) FROM boardtest bt), ?, ?, ?, NOW(), 0)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int insertResult = pstmt.executeUpdate();
			if(insertResult == 1) {
				System.out.println("\n[게시글 등록 성공]");
			}else {
				System.out.println("\n[게시글 등록 실패]");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectOne(int bno) {
		dbConnect();
		
	}
}