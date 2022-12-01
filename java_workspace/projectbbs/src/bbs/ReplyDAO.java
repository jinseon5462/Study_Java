package bbs;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ReplyDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";

    Map<Integer, Integer> list = new HashMap<>();
    public ReplyDAO(Map<Integer, Integer> bList){
        this.list = bList;
    }

    public ReplyDAO(){}

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

    public void selectOneReply(int key) {
        dbConnect();
        String selectReply_query = "SELECT * FROM reply WHERE bno = ?";
        try {
			pstmt = conn.prepareStatement(selectReply_query);
			pstmt.setInt(1, key);
			rs = pstmt.executeQuery();
			
			System.out.println("\n[댓글]");
			while(rs.next()){
				System.out.println("\n------------------------------------------\n");
				//System.out.print("[댓글 번호 : " + rs.getInt("rno"));
				System.out.println("[  댓글 내용  ] " + rs.getString("comments"));
				System.out.println("[ 댓글 작성자 ] " + rs.getString("writer"));
				System.out.println("[  작성 일자  ] " + rs.getString("regdate"));
			}
			System.out.println("\n------------------------------------------\n");
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    // Reply
    public void regReply(int value, String comments, String writer) {
        dbConnect();
        String insertReply_query = "INSERT INTO reply (bno, comments, writer, regdate)"
                + " VALUES (?, ?, ?, NOW())";
        try {
			pstmt = conn.prepareStatement(insertReply_query);
			pstmt.setInt(1, list.get(value));
			pstmt.setString(2, comments);
			pstmt.setString(3, writer);
			int result = pstmt.executeUpdate();
			if(result == 1){
				System.out.println("댓글 등록 성공");
			}else{
				System.out.println("댓글 등록 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public int replyCount(int bno) {
        dbConnect();
        String replyCount = "SELECT COUNT(rno) FROM reply WHERE bno = ?";
        int result = 0;
        try {
			pstmt = conn.prepareStatement(replyCount);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return result;
    }

    public void deleteReply(){

    }
}
