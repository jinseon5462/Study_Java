package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";
        String id = "aaaa";
        String pw = "1234";
        String name = "김종덕";
        String tel = "010-1234-1234";

        String insert_query = "INSERT INTO member (id, pw, name, tel) VALUES ('" + id + "', '"
                                + pw + "', '" + name + "', '" + tel + "')";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, uid, upw);
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(insert_query);
            if(result == 1){
                System.out.println("추가완료!");
            }else{
                System.out.println("추가 실패...");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
