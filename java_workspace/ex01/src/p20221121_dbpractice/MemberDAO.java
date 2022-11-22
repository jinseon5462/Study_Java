package p20221121_dbpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insert(MemberVO member) {
		String insert_query = "INSERT INTO member (id, pw, name, tel) VALUES ('"
				+ member.getId() + "', '" + member.getPw() 
				+ "', '" + member.getName() + "', '" + member.getTel() + "')";
		conn = dbConnect();
		//int result = stmt.executeUpdate(insert_query);
		
	}
}
