package p20221123_boardproject;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";
    Map<Integer, Integer> list = new HashMap<>();
    int cnt = 1;
    ReplyDAO rdao = new ReplyDAO(list);

    public Connection dbConnect() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        return conn;
    }

    // Create

    public void insert(BoardVO board) throws SQLException, ClassNotFoundException {
        dbConnect();

        String insert_query = "INSERT INTO board (bno, title, content, writer, date, view)"
                            + " VALUES ((SELECT IFNULL(MAX(bno) + 1, 1) FROM board b), ?, ?, ?, NOW(), 0)";
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
        pstmt.setInt(1, list.get(bno));
        rs = pstmt.executeQuery();

        rs.next();
        String viewUpdate_query = "UPDATE board SET view = ? WHERE bno = ?";
        pstmt = conn.prepareStatement(viewUpdate_query);
        pstmt.setInt(1, rs.getInt("view") + 1);
        pstmt.setInt(2, list.get(bno));
        pstmt.executeUpdate();
        System.out.println("\n[공지]\n");
        System.out.println("[  번호  ] " + bno);
        System.out.println("[  제목  ] " + rs.getString("title"));
        System.out.println("[ 조회수 ] " + (rs.getInt("view") + 1));
        System.out.println("[  내용  ] " + rs.getString("content"));
        System.out.println("[ 작성자 ] " + rs.getString("writer"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("[작성일자] " + sdf.format(rs.getTimestamp("date")));
        if(rs.getTimestamp("updatetime") == null){
            System.out.print("");
        }else{
            System.out.println("[수정일자] " + sdf.format(rs.getTimestamp("updatetime")));
        }
        rdao.selectOneReply(list.get(bno));

        rs.close();
        pstmt.close();
        conn.close();
    }


    public void selectAll() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        dbConnect();
        stmt = conn.createStatement();
        int showCount = 0;
        String selectAll_query = "SELECT * FROM board ORDER BY bno DESC LIMIT 0, 10";
        rs = stmt.executeQuery(selectAll_query);

        while(rs.next()){
            int rsCnt = rs.getInt(1);
            list.put(cnt, rsCnt);
            System.out.println("[   번호   ] " + cnt);
            cnt++;
            System.out.println("[  제목" + " (" + rdao.replyCount(rsCnt) + ")] " + rs.getString("title"));
            //System.out.println("내용 : " + rs.getString("content"));
            System.out.println("[  작성자  ] " + rs.getString("writer"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("[ 작성일자 ] " + sdf.format(rs.getTimestamp("date")));
            if(rs.getTimestamp("updatetime") == null){
                System.out.println();
            }else{
                System.out.println("[수정일자] " + sdf.format(rs.getTimestamp("updatetime")));
                System.out.println();
            }
        }
        cnt = 1;
        rs.close();
        stmt.close();
        conn.close();

    }

    public void selectPage(int page) throws SQLException, ClassNotFoundException {
        dbConnect();
        stmt = conn.createStatement();
        int cnt = 0;
        cnt += 10 * (page - 1);
        String selectPage_query = "SELECT * FROM board ORDER BY bno DESC LIMIT " + cnt + ", 10";
        rs = stmt.executeQuery(selectPage_query);

        while(rs.next()){
            int rsCnt = rs.getInt(1);
            list.put(cnt, rsCnt);
            System.out.println("[   번호   ] " + cnt);
            cnt++;
            System.out.println("[  제목" + " (" + rdao.replyCount(rsCnt) + ")] " + rs.getString("title"));
            //System.out.println("내용 : " + rs.getString("content"));
            System.out.println("[  작성자  ] " + rs.getString("writer"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("[ 작성일자 ] " + sdf.format(rs.getTimestamp("date")));
            if(rs.getTimestamp("updatetime") == null){
                System.out.println();
            }else{
                System.out.println("[수정일자] " + sdf.format(rs.getTimestamp("updatetime")));
                System.out.println();
            }
        }
        cnt = 1;
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
            //System.out.print("[번호 : " + cnt);
            System.out.println("\n[  제목  ] " + rs.getString("title"));
            System.out.println("[  내용  ] " + rs.getString("content"));
            System.out.println("[ 작성자 ] " + rs.getString("writer"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("[작성일자] " + sdf.format(rs.getTimestamp("date")));
            if(rs.getTimestamp("updatetime") == null){
                System.out.println("");
            }else{
                System.out.println("[수정일자] " + sdf.format(rs.getTimestamp("updatetime")));
                System.out.println();
            }
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
        pstmt.setInt(2, list.get(bno));
        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n[공지 수정 성공]");
        }else{
            System.out.println("\n[공지 수정 실패]");
        }
        pstmt.close();
        conn.close();

    }
    // Delete

    public void delete(int bno) throws SQLException, ClassNotFoundException {
        dbConnect();
        String delete_query = "DELETE FROM board WHERE bno = ?";
        pstmt = conn.prepareStatement(delete_query);
        pstmt.setInt(1, list.get(bno));

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n[공지 삭제 성공]");
        }else{
            System.out.println("\n[공지 삭제 실패]");
        }
        pstmt.close();
        conn.close();
    }
    // Reply

    public void regReply(int bno, String comments, String writer) throws SQLException, ClassNotFoundException {
        dbConnect();
        rdao.regReply(list.get(bno), comments, writer);
    }
}
