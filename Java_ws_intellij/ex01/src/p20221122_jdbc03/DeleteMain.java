package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";
        String deleteQuery = "DELETE FROM member WHERE name = 'hong'";

        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();
        int deleteResult = stmt.executeUpdate(deleteQuery);
        if(deleteResult == 1){
            System.out.println("삭제 성공!!");
        }else{
            System.out.println("삭제 실패...ㅠㅠ");
        }
    }
}
