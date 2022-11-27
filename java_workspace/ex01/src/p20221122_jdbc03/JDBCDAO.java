package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
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
	
	public void insert(MemberVO member) {
		dbConnect();
		String query = "INSERT INTO member (id, pw, name, tel) VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getTel());
			int result = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			if(result == 1) {
				System.out.println("\n[회원가입이 성공적으로 완료되었습니다!]");
			}else {
				System.out.println("\n[회원가입에 실패했습니다...]");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int checkSameId(String id) {
		dbConnect();
		String query = "SELECT COUNT(id) cnt FROM member WHERE id = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getInt("cnt") == 1){
				//System.out.println("\n[중복된 아이디입니다.");
				result = 1;
				rs.close();
				pstmt.close();
				conn.close();
			}else {
				//System.out.println("\n[사용가능한 아이디입니다.]");
				rs.close();
				pstmt.close();
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int loginCheck(String id, String pw) {
		dbConnect();
		int result = 0;
		
		String query = "SELECT pw FROM member WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(pw)) {
					result = 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
