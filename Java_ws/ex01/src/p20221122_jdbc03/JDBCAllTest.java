package p20221122_jdbc03;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JDBCAllTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        JDBCDAO dao = new JDBCDAO();
        int select = -1;

        while(true){
            System.out.println("\n-----------------------------------------------회원관리 프로그램 ver1.0-----------------------------------------------");
            System.out.println("\n| 1. 회원가입 | 2. 회원조회 | 3. 회원명단 조회 | 4. 이름으로 검색 | 5. 아이디 수정 | 6. 회원정보 삭제 | 0. 프로그램 종료 |");
            System.out.print("\n메뉴를 선택해주세요 : ");

            select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
                    boolean loop1 = true;
                    System.out.println("\n[회원가입]");
                    do {
                        System.out.print("\n아이디를 입력하세요 : ");
                        String regId = sc.nextLine();
                        int result = dao.idCheck(regId);
                        if(result == 1){
                            //System.out.println("\n중복된 아이디입니다.");
                        }else{
                            //System.out.println("\n사용가능한 아이디입니다.");
                            System.out.print("\n비밀번호를 입력하세요 : ");
                            String regPw = sc.nextLine();
                            System.out.print("\n이름을 입력하세요 : ");
                            String regName = sc.nextLine();
                            System.out.print("\n전화번호를 입력하세요 : ");
                            String regTel = sc.nextLine();
                            MemberVO member = new MemberVO(regId, regPw, regName, regTel);
                            dao.insert(member);
                            break;
                        }
                    }while(loop1);
                    break;
                case 2:
                    System.out.println("\n[회원조회]");
                    System.out.print("\n조회할 회원의 아이디를 입력해주세요 : ");
                    String searchId = sc.nextLine();
                    System.out.println();
                    dao.selectOne(searchId);
                    break;
                case 3:
                    System.out.println("\n[회원명단 조회]\n");
                    dao.selectAll();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n[이름으로 조회]");
                    System.out.print("\n조회할 이름을 입력해주세요 : ");
                    String searchName = sc.nextLine();
                    dao.selectChoice(searchName);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\n[아이디 수정]");
                    System.out.print("\n현재 아이디를 입력해주세요 : ");
                    String id = sc.nextLine();
                    System.out.print("\n변경할 아이디를 입력해주세요 : ");
                    String updateId = sc.nextLine();
                    dao.update(id, updateId);
                    break;
                case 6:
                    System.out.println("\n[회원정보 삭제]");
                    System.out.print("\n삭제할 아이디를 입력해주세요 : ");
                    String deleteId = sc.nextLine();
                    dao.delete(deleteId);
                    break;
                case 0:
                    System.out.println("\n프로그램을 종료합니다...");
                    System.exit(0);
                default:
                    System.out.println("\n[error][메뉴를 다시 선택해주세요]");
            }
        }
    }
}
