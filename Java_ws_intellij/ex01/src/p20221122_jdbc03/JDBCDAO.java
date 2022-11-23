package p20221122_jdbc03;

import java.sql.*;

public class JDBCDAO {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    final String URL = "jdbc:mariadb://localhost:3306/mydb";
    final String UID = "root";
    final String UPW = "1234";
    final String DRIVER = "org.mariadb.jdbc.Driver";

    public Connection dbConnect() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, UID, UPW);
        return conn;
    }

    public void insert(MemberVO member) throws ClassNotFoundException, SQLException {
        dbConnect();

        String insert_query = "INSERT INTO member (id, pw, name, tel)" + " VALUES (?, ?, ?, ?)";
        pstmt = conn.prepareStatement(insert_query);
        pstmt.setString(1, member.getId());
        pstmt.setString(2, member.getPw());
        pstmt.setString(3, member.getName());
        pstmt.setString(4, member.getTel());

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("가입 성공!");
        }else{
            System.out.println("실패!");
        }
        pstmt.close();
        conn.close();
    }

    public void selectOne(String id) throws ClassNotFoundException, SQLException {
        dbConnect();

        String selectOne_query = "SELECT * FROM member WHERE id = ?";
        pstmt = conn.prepareStatement(selectOne_query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();

        rs.next();
        System.out.print(rs.getString("id"));
        System.out.print(", ");
        System.out.print(rs.getString("pw"));
        System.out.print(", ");
        System.out.print(rs.getString("name"));
        System.out.print(", ");
        System.out.println(rs.getString("tel"));
        rs.close();
        pstmt.close();
        conn.close();
    }

    public void selectAll() throws SQLException, ClassNotFoundException {
        dbConnect();

        stmt = conn.createStatement();
        String selectAll_query = "SELECT * FROM member";
        rs = stmt.executeQuery(selectAll_query);
        while(rs.next()){
            MemberVO member = new MemberVO();
            member.setId(rs.getString("id"));
            member.setPw(rs.getString("pw"));
            member.setName(rs.getString("name"));
            member.setTel(rs.getString("tel"));
            System.out.println(member);
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public void selectChoice(String name) throws SQLException, ClassNotFoundException {
        dbConnect();

        String selectChoice_query = "SELECT * FROM member WHERE name LIKE ?";
        pstmt = conn.prepareStatement(selectChoice_query);
        pstmt.setString(1, "%" + name + "%");
        rs = pstmt.executeQuery();

        while(rs.next()){
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
    }

    public void update(String id, String updateId) throws ClassNotFoundException, SQLException {
        dbConnect();

        String update_query = "UPDATE member SET id = ? WHERE id = ?";
        pstmt = conn.prepareStatement(update_query);
        pstmt.setString(1, updateId);
        pstmt.setString(2, id);
        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n업데이트 성공!");
        }else{
            System.out.println("\n업데이트 실패...");
        }
        pstmt.close();
        conn.close();
    }

    public void delete(String id) throws ClassNotFoundException, SQLException {
        dbConnect();

        String delete_query = "DELETE FROM member WHERE id = ?";
        pstmt = conn.prepareStatement(delete_query);
        pstmt.setString(1, id);

        int result = pstmt.executeUpdate();
        if(result == 1){
            System.out.println("\n삭제 성공!");
        }else{
            System.out.println("\n삭제 실패...");
        }
        pstmt.close();
        conn.close();
    }

    public int idCheck(String id) throws ClassNotFoundException, SQLException {
        dbConnect();

        String idCheck_query = "SELECT COUNT (id) cnt FROM member WHERE id = ?";
        pstmt = conn.prepareStatement(idCheck_query);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
        int result = 0;

        rs.next();
        if(rs.getInt("cnt") == 1){
            System.out.println("\n중복된 아이디입니다.");
            result = 1;
            rs.close();
            pstmt.close();
            conn.close();
            return result;
        }else{
            System.out.println("\n사용가능한 아이디입니다!");
            rs.close();
            pstmt.close();
            conn.close();
            return result;
        }
    }
}
