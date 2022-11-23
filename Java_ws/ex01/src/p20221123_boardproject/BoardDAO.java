package p20221123_boardproject;

import java.sql.*;
import java.text.SimpleDateFormat;

public class BoardDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";

    public Connection dbConnect() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        return conn;
    }

    // Create
    public void insert(BoardVO board) throws SQLException, ClassNotFoundException {
        dbConnect();

        String insert_query = "INSERT INTO board (bno, title, content, writer, date)"
                            + " VALUES ((SELECT IFNULL(MAX(bno) + 1, 1) FROM board b), ?, ?, ?, NOW())";
        pstmt = conn.prepareStatement(insert_query);
        pstmt.setString(1, board.getTitle());
        pstmt.setString(2, board.getContent());
        pstmt.setString(3, board.getWriter());

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n[등록 성공]");
        }else{
            System.out.println("\n[등록 실패]");
        }
    }

    // Read
    public void selectOne(int bno) throws SQLException, ClassNotFoundException {
        dbConnect();
        String selectOne_query = "SELECT * FROM board WHERE bno = ?";
        pstmt = conn.prepareStatement(selectOne_query);
        pstmt.setInt(1, bno);
        rs = pstmt.executeQuery();
        int key = rs.getInt("bno");
        rs.next();
        System.out.println("번호 : " + rs.getInt("bno"));
        System.out.println("제목 : " + rs.getString("title"));
        System.out.println("내용 : " + rs.getString("content"));
        System.out.println("작성자 : " + rs.getString("writer"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("작성일자 : " + sdf.format(rs.getTimestamp("date")));
        if(rs.getTimestamp("updatetime") == null){
            System.out.println();
        }else{
            System.out.println("수정일자 : " + sdf.format(rs.getTimestamp("updatetime")));
        }
        System.out.println();

        rs.close();
        pstmt.close();
        conn.close();
    }

    public void selectAll() throws SQLException, ClassNotFoundException {
        dbConnect();

        stmt = conn.createStatement();
        String selectAll_query = "SELECT * FROM board";
        rs = stmt.executeQuery(selectAll_query);

        while(rs.next()){
            System.out.println("번호 : " + rs.getInt("bno"));
            System.out.println("제목 : " + rs.getString("title"));
            System.out.println("내용 : " + rs.getString("content"));
            System.out.println("작성자 : " + rs.getString("writer"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("작성일자 : " + sdf.format(rs.getTimestamp("date")));
            if(rs.getTimestamp("updatetime") == null){
                System.out.println();
            }else{
                System.out.println("수정일자 : " + sdf.format(rs.getTimestamp("updatetime")));
            }
            System.out.println();
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public void selectChoice(String title) throws SQLException, ClassNotFoundException {
        dbConnect();
        String selectChoice_query = "SELECT * FROM board WHERE title LIKE ?";
        pstmt = conn.prepareStatement(selectChoice_query);
        pstmt.setString(1, "%" + title + "%");
        rs = pstmt.executeQuery();

        while(rs.next()){
            System.out.println("번호 : " + rs.getInt("bno"));
            System.out.println("제목 : " + rs.getString("title"));
            System.out.println("내용 : " + rs.getString("content"));
            System.out.println("작성자 : " + rs.getString("writer"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("작성일자 : " + sdf.format(rs.getTimestamp("date")));
            if(rs.getTimestamp("updatetime") == null){
                System.out.println();
            }else{
                System.out.println("수정일자 : " + sdf.format(rs.getTimestamp("updatetime")));
            }
            System.out.println();
        }
        rs.close();
        pstmt.close();
        conn.close();
    }

    // Update
    public void update(String content, int bno) throws SQLException, ClassNotFoundException {
        dbConnect();
        String update_qeury = "UPDATE board SET content = ?, updatetime = NOW() WHERE bno = ?";
        pstmt = conn.prepareStatement(update_qeury);
        pstmt.setString(1, content);
        pstmt.setInt(2, bno);
        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n[게시글 수정 성공]");
        }else{
            System.out.println("\n[게시글 수정 실패]");
        }
        pstmt.close();
        conn.close();

    }

    // Delete
    public void delete(int bno) throws SQLException, ClassNotFoundException {
        dbConnect();
        String delete_query = "DELETE FROM board WHERE bno = ?";
        pstmt = conn.prepareStatement(delete_query);
        pstmt.setInt(1, bno);

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n[게시글 삭제 성공]");
        }else{
            System.out.println("\n[게시글 삭제 실패]");
        }
        pstmt.close();
        conn.close();
    }
}
