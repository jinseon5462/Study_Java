package p20221122_jdbc03;

import java.sql.Connection;
import java.sql.SQLException;

public class Test01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCDAO dao = new JDBCDAO();
        for(int i = 0; i < 200; i++){
            Connection conn = dao.dbConnect();
            System.out.println(i + ") " + conn);
        }
    }
}
