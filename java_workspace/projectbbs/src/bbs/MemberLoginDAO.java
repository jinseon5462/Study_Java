package bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MemberLoginDAO {
	public static void main(String[] args) {
		final String url = "jdbc:mariadb://localhost:3306/mydb";
		final String uid = "root";
		final String upw = "1234";
		final String driver = "org.mariadb.jdbc.Driver";
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			//conn = DriverMananger.getConnection(url, uid, upw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
