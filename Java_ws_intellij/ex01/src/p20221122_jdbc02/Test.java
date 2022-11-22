package p20221122_jdbc02;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        MemberDAO dao = new MemberDAO();

        for(int i = 0; i < 3; i++) {
            System.out.print("아이디를 입력하세요 : ");
            String id = sc.nextLine();
            System.out.print("비밀번를 입력하세요 : ");
            String pw = sc.nextLine();
            System.out.print("이를을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("전화번호를 입력하세요 : ");
            String tel = sc.nextLine();
            MemberVO member = new MemberVO(id, pw, name, tel);
            dao.insert(member);
        }

        ArrayList<MemberVO> list = dao.selectAll();
        for(MemberVO m : list) {
            System.out.println(m);
        }
    }
}
