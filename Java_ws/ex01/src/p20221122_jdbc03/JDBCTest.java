package p20221122_jdbc03;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        JDBCDAO dao = new JDBCDAO();

        // CREATE
        System.out.print("[Insert] 아이디를 입력하세요 : ");
        String insertId = sc.nextLine();
        System.out.print("[Insert] 비밀번호를 입력하세요 : ");
        String insertPw = sc.nextLine();
        System.out.print("[Insert] 이름을 입력하세요 : ");
        String insertName = sc.nextLine();
        System.out.print("[Insert] 전화번호를 입력하세요 : ");
        String insertTel = sc.nextLine();
        MemberVO member = new MemberVO(insertId, insertPw, insertName, insertTel);
        dao.insert(member);

        //READ
        System.out.println("--------------------");
        System.out.println("[Select One]");
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        dao.selectOne(id);
        System.out.println("--------------------");
        System.out.println("[Select All]");
        dao.selectAll();
        System.out.println("--------------------");
        System.out.println("[Select Choice]");
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        dao.selectChoice(name);

        //UPDATE
        System.out.println("--------------------");
        System.out.print("[Update] 수정하기전의 아이디를 입력해주세요 : ");
        System.out.println();

        //DELETE
        System.out.println("--------------------");
        System.out.println("[Delete]");
        System.out.print("삭제할 아이디를 입력해주세요 : ");
        String deleteId = sc.nextLine();
        System.out.println("삭제후 리스트");
        dao.delete(deleteId);
        dao.selectAll();
    }
}
