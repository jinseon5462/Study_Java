package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	final String url = "jdbc:mariadb://localhost:3306/mydb";
	final String uid = "root";
	final String upw = "1234";
	final String driver = "org.mariadb.jdbc.Driver";
	
	public Connection dbConnect() {	// db연결
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

        String insert_query = "INSERT INTO member (id, pw, name, tel)"
                            + " VALUES (?, ?, ?, ?)";
        try {
			pstmt = conn.prepareStatement(insert_query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getTel());
			int result = pstmt.executeUpdate();
			if(result == 1){
				System.out.println("\n[회원가입 성공]");
			}else{
				System.out.println("\n[회원가입 실패]");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

    }
	
	public int idCheck(String id) {	// 아이디 중복체크
		dbConnect();
		String query = "SELECT COUNT(id) cnt FROM memberlogin WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getInt("cnt") == 1) {
					return 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int loginCheck(String id, String pw) {	// 로그인 결과 확인
		// 0 : 비밀번호 오류
		// 1 : 로그인 성공
		// -1 : 아이디 없음
		// -2 : ?
		dbConnect();
		String query = "SELECT pw FROM memberlogin WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(pw)) {
					return 1;
				}else {
					return 0;
				}
			}
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -2;
	}
	
	public int gradeCheck(String id, String pw) {	// 등급확인
		// 1 : 관리자
		// 0 : 일반회원
		// -1 : 오류
		dbConnect();
		String query = "SELECT grade FROM member WHERE id = ? AND pw = ?";
		int result = -1;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("grade").equals("master")) {
					result = 1;
				}else if(rs.getString("grade").equals("member")) {
					result = 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
