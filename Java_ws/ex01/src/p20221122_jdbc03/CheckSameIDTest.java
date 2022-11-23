package p20221122_jdbc03;

import java.sql.*;
import java.util.Scanner;

public class CheckSameIDTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";
        String selectOneQuery = "SELECT COUNT (*) FROM member WHERE id = '" + id + "'";

        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(selectOneQuery);

        rs.next();
        if(rs.getInt(1) == 1) {
            System.out.println("중복된 아이디입니다.");
        }else {
            System.out.println("사용가능한 아이디입니다.");
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 : ");
        String loginId = sc.nextLine();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String uid = "root";
        String upw = "1234";
        String driver = "org.mariadb.jdbc.Driver";

        String checkId_query = "SELECT COUNT(id) cnt FROM member WHERE id = '" + loginId + "'";

        Class.forName(driver);
        conn = DriverManager.getConnection(url, uid, upw);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(checkId_query);

        rs.next();
        if(rs.getInt("cnt") == 1){
            System.out.println("중복된 아이디입니다.");
        }else{
            System.out.println("사용가능한 아이디입니다!");
        }


    }
}
