package p20221122_jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
    //member 테이븡에서 벌어지는 모든 일들에 대한 메소드를 정의하는 클래스
    ArrayList<MemberVO> list = new ArrayList<>();

    Connection conn;
    Statement stmt;
    ResultSet rs;

    final String url = "jdbc:mariadb://localhost:3306/mydb";
    final String uid = "root";
    final String upw = "1234";
    final String driver = "org.mariadb.jdbc.Driver";

    public Connection dbConnect() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, uid, upw);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void insert(MemberVO member) throws SQLException {
        String insert_query = "INSERT INTO member (id, pw, name, tel) VALUES ('" + member.getId()
                + "', '" + member.getPw() + "', '" + member.getName() + "', '" + member.getTel() + "')";
        conn = dbConnect();
        int insertResult = stmt.executeUpdate(insert_query);
        if(insertResult == 1) {
            System.out.println("추가 성공!");
        }else {
            System.out.println("추가 실패...");
        }
    }

    public ArrayList<MemberVO> selectAll() throws SQLException {
        conn = dbConnect();
        rs = stmt.executeQuery("SELECT * FROM member");
        MemberVO member = null;

        while(rs.next()) {
            member = new MemberVO();
            member.setId(rs.getString("id"));
            member.setPw(rs.getString("pw"));
            member.setName(rs.getString("name"));
            member.setTel(rs.getString("tel"));
            list.add(member);
        }
        return list;
    }

}
